package org.sustiha.queue;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sustihashreesampath on 3/5/18.
 */
public class QueueAction {

    int readIndex = 0;
    int writeIndex = 0;
   int[] queue = new int[10];

    protected void enqueue(int data)
    {
        queue[writeIndex] = data;
        writeIndex++;

    }


}
