package org.sustiha.binarysearchtree;

/**
 * Created by sustihashreesampath on 4/9/18.
 */
public class FindNext {

    protected static Node next(int data,Node root)
    {
        Node node;
        if(data >= root.getData())
        {
             node = leftDesendent(data,root.getRight());
            return node;
        }
       else
        {
             node = rightAnscestor(data,root);
            return node;
        }
    }

    static Node leftDesendent(int data, Node node)
    {
        if(node.getLeft() != null)
            return leftDesendent(data,node.getLeft());
        return node;
    }

    static Node rightAnscestor(int data,Node node)
    {
        if(node.getParent() == null)
        {
            return null;
        }
        else if(node.getParent().getData()<data)
        {
            return rightAnscestor(data,node.getParent());
        }
        return node.getParent();
    }
}
