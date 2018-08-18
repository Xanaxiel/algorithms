package io.codelavida.ds;

import java.util.Set;

/**
 * An ADT for the Graph data structures represented using an interface.
 * <p>
 * A graph is a pair of sets (V, E), where V is a set of vertices and E is a set
 * of edges where each edge is a pair of vertices that represents a connection
 * between the pair of vertices.
 *
 * @param <V> Node parameter type
 * @author Rabi Panda
 * @since 1.0
 */
public interface Graph<V> {

    /**
     * @return all vertices in the graph
     */
    Set<V> vertices();

    /**
     * @return set of edges in the graph
     */
    Set<Edge<V>> edges();


    /**
     * @return true if the graph is directed
     */
    boolean isDirected();


    /**
     * @param vertex reference to the vertex whose adjacent vertices to be
     *               determined.
     * @return set of vertices that are adjacent to vertex
     */
    Set<V> adjacentVertices(V vertex);


    /**
     * @param vertex reference to the vertex whose degree to be determined.
     * @return number of neighbouring vertices
     */
    int degree(V vertex);

    /**
     * Adds a vertex into the graph
     *
     * @param vertex the vertex to be added
     */
    void addVertex(V vertex);


    /**
     * Adds an edge to the graph
     *
     * @param edge the edge to be added.
     */
    void addEdge(Edge<V> edge);

    /**
     * Removes a vertex into the graph
     *
     * @param vertex the vertex to be removed
     */
    void removeVertex(V vertex);


    /**
     * Removes an edge to the graph
     *
     * @param edge the edge to be removed.
     */
    void removeEdge(Edge<V> edge);

}
