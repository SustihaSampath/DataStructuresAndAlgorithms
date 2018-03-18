package org.sustiha;

import java.math.BigInteger;
import java.util.Scanner;
import java.util.stream.IntStream;

/**
 * Created by sustihashreesampath on 8/7/17.
 */
public class superDigit {

    public static void main(String [] args)
    {

        Scanner scanner = new Scanner(System.in);
        BigInteger number = scanner.nextBigInteger();
        long k = scanner.nextLong();
        BigInteger num = calculateSuperDigit(number);
        System.out.println("super digit is " + calculateSuperDigit(num.multiply(BigInteger.valueOf(k))));
    }

    public static BigInteger calculateSuperDigit(BigInteger number)
    {
        BigInteger sum = new BigInteger("0");
        if(String.valueOf(number).length() <2)
        {
            return number;
        }

        String numberString = String.valueOf(number);
        char[] digits = numberString.toCharArray();
        for(char c:digits)
        {
            int charValue = Character.getNumericValue(c);
            sum = sum.add(BigInteger.valueOf(charValue)) ;
        }

        return calculateSuperDigit(sum);


    }
}
