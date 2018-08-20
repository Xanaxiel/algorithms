package io.codelavida.ds;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Utility class with static methods to operate on the {@link Graph} data
 * structure.
 */
final class Graphs {

    private Graphs() {
    }

    static <V> Graph<V> graphFromEdges(List<Edge<V>> edges, boolean directed) {
        Graph<V> graph = new AdjacencyListGraph<>(directed);
        for (Edge<V> edge : edges) {
            graph.addEdge(edge);
        }
        return graph;
    }

    static <V> Set<V> depthFirstSearch(Graph<V> graph, V start) {
        Search<V> search = new Search<>(graph, start);
        return search.dfs();
    }

    static <V> Set<V> breadthFirstSearch(Graph<V> graph, V start) {
        Search<V> search = new Search<>(graph, start);
        return search.bfs();
    }

    static <V> Iterable<V> shortestPath(Graph<V> graph, V start, V end) {
        Search<V> search = new Search<>(graph, start);
        search.bfs();
        return search.shortestPath(end);
    }


    private static class Search<V> {

        private Graph<V> graph;
        private V start;
        private Set<V> marked;
        private Map<V, V> fromEdgeMap;

        Search(Graph<V> graph, V start) {
            this.graph = graph;
            this.start = start;
        }

        private Set<V> dfs() {
            marked = new HashSet<>();
            fromEdgeMap = new HashMap<>();
            dfs(start);
            return marked;
        }

        private void dfs(V vertex) {
            marked.add(vertex);
            for (V v : graph.adjacentVertices(vertex)) {
                if (!marked.contains(v)) {
                    fromEdgeMap.put(v, vertex);
                    dfs(v);
                }
            }
        }

        private Set<V> bfs() {
            marked = new HashSet<>();
            fromEdgeMap = new HashMap<>();
            Deque<V> queue = new ArrayDeque<>();
            marked.add(start);
            queue.add(start);
            while (!queue.isEmpty()) {
                V u = queue.remove();
                for (V v : graph.adjacentVertices(u)) {
                    if (!marked.contains(v)) {
                        fromEdgeMap.put(v, u);
                        marked.add(v);
                        queue.add(v);
                    }
                }
            }
            return marked;
        }

        private boolean hasPathTo(V end) {
            return marked.contains(end);
        }

        private Iterable<V> shortestPath(V end) {
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
