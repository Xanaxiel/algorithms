package io.codelavida.ds;

/**
 * Represents an edge that connects a pair of vertices in a graph.
 *
 * <ul>
 *     <li>
 *
 *     </li>
 * </ul>
 *
 * @param <V> type parameter of the vertex
 */
class Edge<V> {

    private V predecessor;
    private V successor;

    Edge(V predecessor, V successor) {
        this.predecessor = predecessor;
        this.successor = successor;
    }


}
