package io.codelavida.ds;

/**
 * Represents an edge that connects a pair of vertices in a graph.
 *
 * <ul>
 * <li>
 *
 * </li>
 * </ul>
 *
 * @param <V> type parameter of the vertex
 */
class Edge<V> {

    private V predecessor;
    private V successor;
    private int weight;

    Edge(V predecessor, V successor) {
        this(predecessor, successor, 0);
    }

    Edge(V predecessor, V successor, int weight) {
        this.predecessor = predecessor;
        this.successor = successor;
        this.weight = weight;
    }

    V getPredecessor() {
        return predecessor;
    }

    V getSuccessor() {
        return successor;
    }

    int getWeight() {
        return weight;
    }

}
