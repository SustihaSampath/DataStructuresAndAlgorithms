package org.sustiha.stirngs.arrays;

/**
 * Created by sustihashreesampath on 4/11/18.
 */
public class ZigZag {
    public static void main(String [] args)
    {
        int[] arr = new int[]{1, 4, 3, 2};
        arr = ziZag(arr);
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i] + " ");


    }

    static int[] ziZag(int[] arr)
    {
        int temp = 0;
        for(int i=0;i<arr.length-1;i++)
        {
                if (i % 2 == 0) {
                    if (arr[i] > arr[i + 1]) {
                        temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                } else {
                    if (arr[i] < arr[i + 1]) {
                        temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }

        }
     return arr;
    }
}
