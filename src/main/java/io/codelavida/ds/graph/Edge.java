package io.codelavida.ds.graph;

/**
 * Represents an edge that connects a pair of vertices in a graph
 *
 * @param <V> type parameter of the vertex
 */
public class Edge<V> {

    private V predecessor;
    private V successor;

    Edge(V predecessor, V successor) {
        this.predecessor = predecessor;
        this.successor = successor;
    }


}
