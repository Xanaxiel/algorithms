package io.codelavida.puzzle;

import java.util.ArrayDeque;
import java.util.Deque;

public final class BinaryTree {

    static class Node {
        private int value;
        private Node left;
        private Node right;

        Node(int value) {
            this.value = value;
        }
    }

    /**
     * Print a binary tree from bottom to top in level order. For example,
     * <p>
     * Given the below binary tree
     *
     * <pre>
     *              1
     *          /      \
     *        2        3
     *      /  \        \
     *     4   5        6
     *                /    \
     *               7      8
     * </pre>
     * <p>
     * The output will be 7,8,4,5,6,2,3,1
     *
     * @param root           Node representing the root of the binary tree
     * @param printLevelWise boolean flag to indicate the print
     */
    private static void printLevelFromBottomToTop(Node root,
                                                  boolean printLevelWise) {
        Deque<Node> queue = new ArrayDeque<>();
        queue.add(root);

        Node levelMarker = new Node(-1);
        if (printLevelWise)
            queue.add(levelMarker);

        Deque<Node> stack = new ArrayDeque<>();

        while (!queue.isEmpty()) {
            Node node = queue.remove();
            stack.push(node);

            if (node == levelMarker) {
                if (queue.isEmpty()) {
                    break;
                } else {
                    queue.add(levelMarker);
                    continue;
                }
            }

            if (node.right != null) {
                queue.add(node.right);
            }

            if (node.left != null) {
                queue.add(node.left);
            }
        }

        while (!stack.isEmpty()) {
            Node node = stack.pop();
            if (node == levelMarker) {
                System.out.println();
                continue;
            }
            System.out.print(node.value + " ");
        }
        System.out.println();

    }


    public static void main(String[] args) {
        Node a = new Node(1);
        Node b = new Node(2);
        Node c = new Node(3);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(6);
        Node g = new Node(7);
        Node h = new Node(8);
        a.left = b;
        a.right = c;
        b.left = d;
        c.left = e;
        c.right = f;
        f.left = g;
        f.right = h;

        System.out.println("Single row");
        System.out.println();
        printLevelFromBottomToTop(a, false);

        System.out.println();
        System.out.println("Separate rows");
        printLevelFromBottomToTop(a, true);
    }
}
