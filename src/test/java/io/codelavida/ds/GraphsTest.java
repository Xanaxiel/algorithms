package io.codelavida.ds;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import static com.google.common.truth.Truth.assertThat;

public class GraphsTest {

    Graph<Integer> graph;

    @Before
    public void setUp() {
        List<Edge<Integer>> edgeList = new ArrayList<>();
        edgeList.add(new Edge<>(10, 20));
        edgeList.add(new Edge<>(10, 30));
        edgeList.add(new Edge<>(20, 30));
        edgeList.add(new Edge<>(30, 50));
        edgeList.add(new Edge<>(40, 50));
        graph = Graphs.graphFromEdges(edgeList, false);
    }

    @Test
    public void testGraphFromEdges() {
        assertThat(graph.numEdges()).isEqualTo(5);
        assertThat(graph.numVertices()).isEqualTo(5);
    }

    @Test
    public void testDFS() {
        Set<Integer> visited = Graphs.depthFirstSearch(graph, 10);
        assertThat(visited).containsAllOf(10, 20, 30, 50);
    }

    @Test
    public void testBFS() {
        Set<Integer> visited = Graphs.breadthFirstSearch(graph, 10);
        assertThat(visited).containsAllOf(10, 20, 30, 50);
    }

    @Test
    public void testShortestPathExists() {
        Iterable<Integer> path = Graphs.shortestPath(graph, 10, 50);
        assertThat(path).containsAllOf(10, 30, 50);
    }

    @Test
    public void testShortestPathNotExist() {
        Iterable<Integer> path = Graphs.shortestPath(graph, 10, 40);
        assertThat(path).isNull();
    }

}