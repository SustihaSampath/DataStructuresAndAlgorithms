package org.sustiha.algorithms.divideandconquer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

/**
 * Created by sustihashreesampath on 4/5/18.
 */
public class MajorityElement {
    public static void main(String[] args) {
        FastScanner scanner = new FastScanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

            System.out.println(getMajorityElement(a,n));

    }
    static class FastScanner {
        BufferedReader br;
        StringTokenizer st;

        FastScanner(InputStream stream) {
            try {
                br = new BufferedReader(new InputStreamReader(stream));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        String next() {
            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    static int getMajorityElement(int[] a,int n)
    {
        int count = 0;
        HashMap<Integer,Integer> elmnts = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(elmnts.containsKey(a[i]))
            {
                int value = elmnts.get(a[i]);
                elmnts.put(a[i],value+1);
            }
            else
                elmnts.put(a[i],1);
        }
        for(Map.Entry<Integer,Integer> entry:elmnts.entrySet())
        {
            if(entry.getValue() > n/2)
                count+=1;

        }
        return count;
    }
}
