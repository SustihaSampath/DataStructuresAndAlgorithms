package org.sustiha.checkbrackets;

import java.util.*;

/**
 * Created by sustihashreesampath on 3/30/18.
 */
public class IceCreamParlour {

    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int m = in.nextInt();
            int n = in.nextInt();
            Integer[] arr = new Integer[n];
            for(int arr_i = 0; arr_i < n; arr_i++){
                arr[arr_i] = in.nextInt();
            }
            int[] result = iceCreamParlor(m, Arrays.asList(arr));
            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
            }
            System.out.println("");


        }
        in.close();
    }

    public static int[] iceCreamParlor(int m, List<Integer> arr)
    {
        Map<Integer,Integer> iceCreams = new HashMap<>();
        int[] result = new int[2];
        for(int i=0;i<arr.size();i++)
        {
            Integer value = m-arr.get(i);
            if(iceCreams.containsKey(value))
            {

                    result[0]= i+1;
                    result[1]= iceCreams.get(value)+1;
                Arrays.sort(result);
                return result;

            }
            else{
                iceCreams.put(arr.get(i), i);
            }

        }
        return result;
    }
}
