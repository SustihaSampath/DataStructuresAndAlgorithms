package org.sustiha.checkbrackets;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Stack;


class Bracket {
    Bracket(char type, int position) {
        this.type = type;
        this.position = position;
    }

    boolean Match(char c) {
        if (this.type == '[' && c == ']')
            return true;
        if (this.type == '{' && c == '}')
            return true;
        if (this.type == '(' && c == ')')
            return true;
        return false;
    }

    char type;
    int position;
}

class check_brackets {
    public static void main(String[] args) throws IOException {
        InputStreamReader input_stream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input_stream);
        String text = reader.readLine();
        Stack<Bracket> opening_brackets_stack = new Stack<Bracket>();
        boolean isMatch = true;
        int pos=0;
        for (int position = 0; position < text.length(); ++position) {
            char next = text.charAt(position);

            if (next == '(' || next == '[' || next == '{') {
                opening_brackets_stack.push(new Bracket(next,position));

            }

            if (next == ')' || next == ']' || next == '}') {
                // Process closing bracket, write your code here
                //char type = opening_brackets_stack.pop();
                Bracket bracket = opening_brackets_stack.pop();
                isMatch = bracket.Match(next);

            }
            if(!isMatch) {
                pos = position;
                break;
            }
        }
        if(isMatch)
        {
            System.out.println("success");
        }
        else
        {
            System.out.println(++pos);
        }

        // Printing answer, write your code here
    }
}
