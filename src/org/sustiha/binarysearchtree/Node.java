package org.sustiha.binarysearchtree;

/**
 * Created by sustihashreesampath on 3/5/18.
 */
public class Node {

    private int data;
    private Node parent;
    private Node left;
    private Node right;

    public Node(int data, Node parent, Node left, Node right) {
        this.data = data;
        this.parent = parent;
        this.left = left;
        this.right = right;
    }

    public Node() {
    }

    public int getData() {
        return data;
    }

    public Node getParent() {
        return parent;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
