package org.sustiha.binarysearchtree;

/**
 * Created by sustihashreesampath on 4/9/18.
 */
public class Rotations {

    static void rightRotation(Node rotateNode)
    {
        Node parent = rotateNode.getParent();
        Node nextParent = rotateNode.getLeft();
        Node child = nextParent.getRight();
        nextParent.setParent(parent);
        if(parent.getRight().getData() == rotateNode.getData())
            parent.setRight(nextParent);
        if(parent.getLeft().getData() == rotateNode.getData())
            parent.setLeft(nextParent);
        nextParent.setRight(rotateNode);
        rotateNode.setParent(nextParent);
        rotateNode.setLeft(child);
        child.setParent(rotateNode);

    }

    static void leftRotation(Node rotateNode)
    {
        Node parent = rotateNode.getParent();
        Node nextParent = rotateNode.getRight();
        Node child = nextParent.getLeft();
        nextParent.setParent(parent);
        if(parent.getRight().getData() == rotateNode.getData())
            parent.setRight(nextParent);
        if(parent.getLeft().getData() == rotateNode.getData())
            parent.setLeft(nextParent);
        nextParent.setLeft(rotateNode);
        rotateNode.setParent(nextParent);
        rotateNode.setRight(child);
        child.setParent(rotateNode);

    }
}
