package org.sustiha.datastructure.greedy;

import java.util.*;

/**
 * Created by sustihashreesampath on 4/4/18.
 */
public class LootValue {

    static int[] values;
    static int[] weights;

    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int capacity = scanner.nextInt();
        values = new int[n];
        weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = scanner.nextInt();
            weights[i] = scanner.nextInt();
        }

        quickSort(0,weights.length-1);

        System.out.printf("%.4f", getOptimalValue(capacity, values, weights));
    }

    public static float getOptimalValue(int capacity,int[] values,int[] weights)
    {
        float value=0;int a;
        for(int i=weights.length-1;i>=0;i--) {
            if (capacity == 0)
                return value;
            a = Math.min(capacity,weights[i]);
            value= value+(a*((float)values[i]/weights[i]));
            capacity=capacity-a;
        }
        return value;
    }

    public static void quickSort(int start,int end)
    {
        if(start <end) {
            int index = partition(values, weights, start, end);
            quickSort(start, index - 1);
            quickSort(index + 1, end);
        }

    }

    public static int partition(int[] v,int[] w,int start,int end)
    {
        int pivot = v[end]/w[end];
        int index = start;
        for(int i=start;i<end;i++)
        {
            if(v[i]/w[i]<pivot)
            {
                int temp = v[index];
                v[index] = v[i];
                v[i] = temp;
                temp = w[index];
                w[index] = w[i];
                w[i] = temp;
                index+=1;
            }
        }
        int temp = v[index];
        v[index] = v[end];
        v[end] = temp;
        temp = w[index];
        w[index] = w[end];
        w[end] = temp;
        return index;
    }


}
