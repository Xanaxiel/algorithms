package io.codelavida.ds;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Implementing the Graph ADT using the adjacency list representation.
 *
 * @param <V>
 */
public class AdjacencyListGraph<V> implements Graph<V> {

    private Map<V, Set<Edge<V>>> vertices = new HashMap<>();

    private boolean directed;

    private int numVertices;
    private int numEdges;

    AdjacencyListGraph(boolean directed) {
        this.directed = directed;
    }

    @Override
    public Set<V> vertices() {
        return vertices.keySet();
    }

    @Override
    public Set<Edge<V>> edges() {
        Set<Edge<V>> edges = new HashSet<>();
        vertices.forEach((key, value) -> edges.addAll(value));
        return edges;
    }

    @Override
    public boolean isDirected() {
        return directed;
    }

    @Override
    public Set<V> adjacentVertices(V vertex) {
        Set<Edge<V>> edges = vertices.get(vertex);
        Set<V> adjVertices = new HashSet<>();
        edges.forEach(edge -> adjVertices.add(edge.getSuccessor()));
        return adjVertices;
    }

    @Override
    public int degree(V vertex) {
        return vertices.get(vertex).size();
    }

    @Override
    public void addVertex(V vertex) {
        if (!vertices.containsKey(vertex)) {
            vertices.put(vertex, new HashSet<>());
            numVertices++;
        }
    }

    @Override
    public void addEdge(Edge<V> edge) {
        V u = edge.getPredecessor();
        V v = edge.getSuccessor();

        addVertex(u);
        addVertex(v);

        vertices.get(u).add(edge);

        if (!directed) {
            vertices.get(v).add(edge);
        }

        numEdges++;
    }

    @Override
    public void removeVertex(V vertex) {
        vertices.remove(vertex);
    }

    @Override
    public void removeEdge(Edge<V> edge) {
        vertices.get(edge.getPredecessor()).remove(edge);
    }

    @Override
    public int numVertices() {
        return numVertices;
    }

    @Override
    public int numEdges() {
        return numEdges;
    }
}
