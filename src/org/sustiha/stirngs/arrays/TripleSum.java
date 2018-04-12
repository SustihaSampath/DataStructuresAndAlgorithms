package org.sustiha.stirngs.arrays;

/**
 * Created by sustihashreesampath on 4/11/18.
 */
public class TripleSum {

    public static void main(String [] args)
    {
        int n = 2;
       int[] arr = new int[]{-2, 0, 1, 3};
       System.out.println(tripleSum(arr,0,2,0,n));

    }


    static int tripleSum(int[] arr,int i,int j,int count,int n)
    {
        if(arr.length-i < 3)
            return count;
        if(arr[i] +arr[i+1] + arr[j] < n)
            count+=1;
        if(j!=arr.length-1)
            j+=1;
        else
        {
            i++;
            if(i+2 < arr.length)
                j =i+2;
        }
        return tripleSum(arr,i,j,count,n);
    }
}

