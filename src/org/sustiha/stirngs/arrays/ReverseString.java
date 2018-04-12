package org.sustiha.stirngs.arrays;

import com.sun.deploy.util.StringUtils;

import java.util.regex.Pattern;

/**
 * Created by sustihashreesampath on 4/11/18.
 */
public class ReverseString {

    public static void main(String [] args)
    {
        String s = "Ab,c,de!$";
        System.out.println(reverse(s));
    }

    static String reverse(String s)
    {
        char[] c = s.toCharArray();
        int i=0,j=c.length-1;
        while(i != j)
        {
            if(!Character.isAlphabetic(c[i]) && !Character.isDigit(c[i]) )
            {
                i++;
            }
            else if(!Character.isAlphabetic(c[j]) && !Character.isDigit(c[j]) )
            {
                j--;
            }
            else {
                char temp = c[i];
                c[i] = c[j];
                c[j] = temp;
                i++;
                j--;
            }

        }
      return  String.valueOf(c);
    }
}
