package org.sustiha.binarysearchtree;

/**
 * Created by sustihashreesampath on 3/5/18.
 */
public class BinarySearchTree {

    public static void main(String [] args)
    {
        BstAction bstAction = new BstAction();
        bstAction.insert(10);
        bstAction.insert(20);
        bstAction.insert(30);
        bstAction.insert(8);
        bstAction.insert(25);
        bstAction.inOrder();
        int height = bstAction.getHeight(bstAction.getRoot());
        System.out.println(height);
        Node node = bstAction.find(20,bstAction.getRoot());
        System.out.println(node.getData());
    }
}
