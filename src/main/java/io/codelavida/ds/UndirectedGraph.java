package io.codelavida.ds;

import java.util.Set;

/**
 * Implementation of an undirected graph using adjacency list of vertices.
 */
public class UndirectedGraph<V> implements Graph<V> {
    @Override
    public Set<V> vertices() {
        return null;
    }

    @Override
    public Set<Edge<V>> edges() {
        return null;
    }

    @Override
    public boolean isDirected() {
        return false;
    }

    @Override
    public Set<V> adjacentVertices(Object vertex) {
        return null;
    }

    @Override
    public int degree(Object vertex) {
        return 0;
    }

    @Override
    public void addVertex(Object vertex) {

    }

    @Override
    public void addEdge(Edge edge) {

    }

    @Override
    public void removeVertex(Object vertex) {

    }

    @Override
    public void removeEdge(Edge edge) {

    }
}
