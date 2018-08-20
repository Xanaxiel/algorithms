package io.codelavida.ds;

import org.junit.Test;

import java.util.Set;

import static com.google.common.truth.Truth.assertThat;

public class GraphsTest {

    @Test
    public void testDFS() {
        Graph<Integer> graph = new AdjacencyListGraph<>(true);
        graph.addVertex(10);
        graph.addVertex(20);
        graph.addVertex(30);
        graph.addVertex(40);
        graph.addVertex(50);

        graph.addEdge(new Edge<>(10, 20));
        graph.addEdge(new Edge<>(10, 30));
        graph.addEdge(new Edge<>(30, 50));
        graph.addEdge(new Edge<>(40, 50));


        Set<Integer> visited = Graphs.depthFirstSearch(graph, 10);

        assertThat(visited).containsAllOf(10, 20, 30, 50);

        Iterable<Integer> path = Graphs.path(graph, 10, 50);
        assertThat(path).containsAllOf(10, 30, 50);

    }

}