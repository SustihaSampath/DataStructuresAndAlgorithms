package org.sustiha.binarysearchtree;

/**
 * Created by sustihashreesampath on 3/5/18.
 */
public class AvlNode {

    private int data;
    private AvlNode parent;
    private AvlNode left;
    private AvlNode right;
    private int height;

    public AvlNode(int data, AvlNode parent, AvlNode left, AvlNode right,int height) {
        this.data = data;
        this.parent=parent;
        this.left = left;
        this.right = right;
        this.height=height;
    }

    public int getData() {
        return data;
    }

    public AvlNode getLeft() {
        return left;
    }

    public AvlNode getRight() {
        return right;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setLeft(AvlNode left) {
        this.left = left;
    }

    public void setRight(AvlNode right) {
        this.right = right;
    }

    public AvlNode getParent() {
        return parent;
    }

    public void setParent(AvlNode parent) {
        this.parent = parent;
    }


}
