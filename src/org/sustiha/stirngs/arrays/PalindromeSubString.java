package org.sustiha.stirngs.arrays;

/**
 * Created by sustihashreesampath on 4/11/18.
 */
public class PalindromeSubString {

    public static void main(String [] args)
    {
        String s = "nitin";
        palinPartition(s,0,s.length()-1);
    }

    static boolean isPalindrome(String s, int i,int j)
    {
        while(i != j)
        {
            if(s.charAt(i) == s.charAt(j))
            {
                i++;
                j--;
            }
            else
                return false;
        }
        return true;
    }

    static void palinPartition(String s, int i,int j)
    {
        if(isPalindrome(s,i,j))
            System.out.println(s.substring(i,j+1));
        if(i != j)
            palinPartition(s,i+1,j-1);
    }
}
