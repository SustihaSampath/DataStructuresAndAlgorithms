package org.sustiha.datastructure.greedy;

import java.util.Scanner;

/**
 * Created by sustihashreesampath on 4/4/18.
 */
public class CoinChange {

    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);

        int[] denominations = new int[]{10,5,1};
        System.out.println(coinChange(denominations,scanner.nextInt()));
    }

    public static int coinChange(int[] denominations,int amount)
    {
        int count = 0;
        for(int i=0;i<denominations.length;i++)
        {
            if(amount>=denominations[i])
            {
                while(amount-denominations[i]>=0)
                {
                    amount=amount-denominations[i];
                    count=count+1;
                }
            }
        }
        return count;
    }
}
