package io.codelavida.ds;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Utility class with static methods to operate on the {@link Graph} data
 * structure.
 */
final class Graphs {

    private Graphs() {
    }

    static <V> Set<V> depthFirstSearch(Graph<V> graph, V start) {
        DepthFirstSearch<V> dfs = new DepthFirstSearch<>(graph, start);
        return dfs.search();
    }

    static <V> Iterable<V> path(Graph<V> graph, V start, V end) {
        DepthFirstSearch<V> dfs = new DepthFirstSearch<>(graph, start);
        dfs.search();
        return dfs.path(end);
    }


    private static class DepthFirstSearch<V> {

        private Graph<V> graph;
        private V start;
        private Set<V> marked;
        private Map<V, V> fromEdgeMap;

        DepthFirstSearch(Graph<V> graph, V start) {
            this.graph = graph;
            this.start = start;
            marked = new HashSet<>();
            fromEdgeMap = new HashMap<>();
        }

        private Set<V> search() {
            search(start);
            return marked;
        }

        private void search(V vertex) {
            marked.add(vertex);
            for (V v : graph.adjacentVertices(vertex)) {
                if (!marked.contains(v)) {
                    fromEdgeMap.put(v, vertex);
                    search(v);
                }
            }
        }

        private boolean hasPathTo(V end) {
            return marked.contains(end);
        }

        private Iterable<V> path(V end) {
            if (!hasPathTo(end)) return null;
            Deque<V> path = new ArrayDeque<>();
            for (V v = end; v != start; v = fromEdgeMap.get(v)) {
                path.push(v);
            }
            path.push(start);
            return path;
        }
    }


}
