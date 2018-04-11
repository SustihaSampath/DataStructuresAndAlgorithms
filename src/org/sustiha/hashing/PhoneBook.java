package org.sustiha.hashing;

import java.util.*;

/**
 * Created by sustihashreesampath on 3/26/18.
 */
 class PhoneBook {

    static Map<String,String> phoneBook  = new HashMap<>();

    public static void main(String[] args) {

        List<String> foundNumbers = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 0; i <=n; i++)
        {
            String s = scanner.nextLine();
            StringTokenizer stringTokenizer = new StringTokenizer(s, " ");
            if(stringTokenizer.hasMoreElements())
            {
                String query = stringTokenizer.nextToken();
                if(query.equalsIgnoreCase("add"))
                {
                    PhoneBook.addDetails(stringTokenizer.nextToken(),stringTokenizer.nextToken());
                }
                if(query.equalsIgnoreCase("del"))
                {
                    PhoneBook.deleteNumber(stringTokenizer.nextToken());
                }
                if(query.equalsIgnoreCase("find"))
                {
                    foundNumbers.add(PhoneBook.findNumber(stringTokenizer.nextToken()));
                }
            }
        }
        foundNumbers.stream().forEach(System.out::println);
    }


        public static void addDetails(String number,String name)
        {
            phoneBook.put(number,name);
        }

        public static void deleteNumber(String number)
        {
            phoneBook.remove(number);
        }

        public static String findNumber(String number)
        {
            String name = phoneBook.get(number);
            return name != null?name:"not found";
        }
}
