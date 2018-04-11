package org.sustiha.hashing;

import java.util.LinkedList;

/**
 * Created by sustihashreesampath on 3/27/18.
 */
public class HashingChain {

    LinkedList<String> hashList = new LinkedList<>();
    public static void main(String [] args)
    {

    }

    public static int hash(String s)
    {
        int p = 1000000007;
        int x = 263;
        char[] chars = s.toCharArray();
        int hash = 0;
        for(int i=chars.length-1;i>0;i--)
        {
            hash = (hash*x+(int)chars[i])%p;
        }
        return hash;
    }

    protected void set(String s)
    {
        int hashValue = hash(s);

    }

}
