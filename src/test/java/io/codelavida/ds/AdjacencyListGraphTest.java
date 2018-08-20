package io.codelavida.ds;

import org.junit.Test;

import static com.google.common.truth.Truth.assertThat;

public class AdjacencyListGraphTest {

    @Test
    public void testAddVertex() {
        Graph<Integer> graph = new AdjacencyListGraph<>(false);
        graph.addVertex(10);
        assertThat(graph.vertices()).hasSize(1);
    }

    @Test
    public void testVertexDegree() {
        Graph<Integer> graph = new AdjacencyListGraph<>(false);
        graph.addVertex(10);
        assertThat(graph.degree(10)).isEqualTo(0);
    }

    @Test
    public void testAddEdgeToUndirectedGraph() {
        Graph<Integer> graph = new AdjacencyListGraph<>(false);
        graph.addVertex(10);
        graph.addVertex(20);
        graph.addEdge(new Edge<>(10, 20));
        assertThat(graph.edges()).hasSize(1);
        assertThat(graph.degree(10)).isEqualTo(1);
        assertThat(graph.degree(20)).isEqualTo(1);
    }

    @Test
    public void testAddEdgeToDirectedGraph() {
        Graph<Integer> graph = new AdjacencyListGraph<>(true);
        graph.addVertex(10);
        graph.addVertex(20);
        graph.addEdge(new Edge<>(10, 20));
        assertThat(graph.edges()).hasSize(1);
        assertThat(graph.degree(10)).isEqualTo(1);
        assertThat(graph.degree(20)).isEqualTo(0);
    }

}