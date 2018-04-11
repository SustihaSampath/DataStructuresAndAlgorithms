package org.sustiha.checkbrackets;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created by sustihashreesampath on 3/28/18.
 */
public class IceCreamProblem {

    static int[] icecreamParlor(int m, int[] arr) {
        int[] tmp = Arrays.copyOf(arr,arr.length);
        Arrays.sort(arr);
        return IceCreamProblem.getFlavours(m,arr,0,arr.length-1,tmp);
    }

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
            int[] arr = new int[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            int[] result = icecreamParlor(m, arr);
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
            System.out.println("");


        }
        in.close();
    }

    public static  int[] getFlavours(int money,int[] arr,int low,int high,int[] tmp)
    {
        int[] result = new int[2];
        for(int i=0;i<arr.length;i++)
        {
            int mid = (low+high)/2;
            int value = money -arr[i];
            if(high >= low) {
                if (arr[mid] == value) {
                    for (int j = 0; j < tmp.length; j++) {
                        if (result[0] == 0 && tmp[j] == arr[i])
                            result[0] = j + 1;
                        if (tmp[j] == value)
                            result[1] = j + 1;

                    }
                    Arrays.sort(result);
                    return result;
                } else if (arr[mid] > value) {
                    getFlavours(money, arr, mid + 1, arr.length - 1, tmp);
                } else {
                    getFlavours(money, arr, 0, mid - 1, tmp);
                }
            }

        }
        return result;
    }
}
