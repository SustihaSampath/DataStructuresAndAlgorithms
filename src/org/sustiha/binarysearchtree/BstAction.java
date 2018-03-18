package org.sustiha.binarysearchtree;

/**
 * Created by sustihashreesampath on 3/5/18.
 */
public class BstAction {

    private Node root;

    public void insert(int data)
    {

        Node node1  = new Node();
        if(root == null)
        {
            root = new Node(data,null,null,null);
        }
        else
        {
            Node node = find(data,root);
            node1.setData(data);
            if(node.getData() > data)
            {
               node1.setParent(node);
               node.setLeft(node1);

            }
            else
            {
                node1.setParent(node);
                node.setRight(node1);

            }



        }
    }


    protected Node find(int data,Node node)
    {
        if(data == node.getData())
            return node;
        else if(data > node.getData()) {
            if(node.getRight() != null)
                return find(data, node.getRight());
            else
                return node;
        }
        else
        {
            if(node.getLeft() != null)
             return find(data,node.getLeft());
            else
                return node;
        }


    }

    protected void inOrder()
    {
        inOrderTraverse(root);
    }

    protected void inOrderTraverse(Node root)
    {
         if(root.getLeft()!= null)
         inOrderTraverse(root.getLeft());
         System.out.println(root.getData());
         if(root.getRight() != null)
         inOrderTraverse(root.getRight());

    }

    protected int getHeight(Node root)
    {
        if(root.getRight() != null)
            return 1+ getHeight(root.getRight());
        else if(root.getLeft() != null)
            return 1+ getHeight(root.getLeft());
        else return 1;

    }

    protected Node getRoot()
    {
        return root;

    }

    protected void delete(int data)
    {

    }

    /*protected Node next(int data)
    {
        if(data > root)
        {

        }
        return root;
    }*/
}
