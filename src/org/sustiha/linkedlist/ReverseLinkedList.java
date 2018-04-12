package org.sustiha.linkedlist;

/**
 * Created by sustihashreesampath on 4/11/18.
 * Given Linked list
 85 15 4 20
 Reversed linked list
 20 4 15 85
 */
public class ReverseLinkedList {

    static Node head;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void main(String[] args) {
        ReverseLinkedList list = new ReverseLinkedList();
        list.head = new Node(1);
        list.insertInSortedList(new Node(0));
        list.insertInSortedList(new Node(2));
        list.insertInSortedList(new Node(3));
        list.insertInSortedList(new Node(4));
        list.insertInSortedList(new Node(6));
        list.insertInSortedList(new Node(5));

        System.out.println("Given Linked list");
        list.printList(head);
        head = list.reverse(head);
        System.out.println("");
        System.out.println("Reversed linked list ");
        list.printList(head);
    }

    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    public Node reverse(Node head)
    {
        Node prev = null;
        Node current = head;
        Node next1 = null;
        while(current!= null)
        {
            next1 =current.next;
            current.next=prev;
            prev = current;
            current = next1;
        }
        return prev;
    }

    public void insertInSortedList(Node node)
    {
        Node current;

        if(head.next == null || head.data > node.data )
        {
            node.next = head;
            head = node;
        }
        else
        {
            current = head;
            while(current.next != null &&  current.next.data < node.data)
                {
                    current = current.next;
                }

            node.next = current.next;
            current.next = node;

        }
    }
}
