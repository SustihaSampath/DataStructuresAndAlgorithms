package org.sustiha.binarysearchtree;

import java.util.Scanner;

/**
 * Created by sustihashreesampath on 4/6/18.
 */
public class MinimumLoss {

    static Node root;
    static int[] prices ;
    static int minimumLoss(int[] price) {
            return 0;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] price = new int[n];
        prices = new int[n];
        for(int price_i = 0; price_i < n; price_i++){
            price[price_i] = in.nextInt();
            insert(price[price_i]);
        }
        inOrder(root,0);
        int result = minimumLoss(price);
        System.out.println(result);
        in.close();
    }

    static void insert(int price)
    {
        /*if(root == null)
        {
            root = new Node(price,null,null);
        }
        else
        {
            Node foundNode = find(price,root);
            if(foundNode.getData() > price)
            {
                foundNode.setLeft(new Node(price,null,null));
            }
            else if(foundNode.getData() < price)
            {
                foundNode.setRight(new Node(price,null,null));

            }
        }
*/
    }

    static Node find(int price,Node node)
    {
        if(price == node.getData())
            return node;
        else if(price < node.getData())
        {
            if(node.getLeft() != null)
                return find(price,node.getLeft());
            return node;
        }
        else
        {
            if(node.getRight() != null)
                return find(price,node.getRight());
            return node;
        }
    }

    static void inOrder(Node node,int i)
    {
        if(node == null)
            return ;
        inOrder(node.getLeft(),i);
        prices[i] = node.getData();
        i++;
        inOrder(node.getRight(),i);


    }
}
