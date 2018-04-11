package org.sustiha.queue;

/**
 * Created by sustihashreesampath on 3/22/18.
 */
public class QueueTest {

    public static void main(String [] args)
    {
        QueueAction queueAction = new QueueAction();
        queueAction.enqueue(10);
        queueAction.enqueue(20);
        queueAction.enqueue(30);
        queueAction.printQueue();
        System.out.println(queueAction.dequeue());
        //queueAction.printQueue();
        System.out.println(queueAction.dequeue());
        //queueAction.printQueue();
        System.out.println(queueAction.dequeue());
        queueAction.printQueue();
        queueAction.enqueue(40);
        queueAction.printQueue();


    }
}
