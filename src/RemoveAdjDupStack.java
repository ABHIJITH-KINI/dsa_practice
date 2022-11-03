/*
Remove adjacent duplicate using stack
 */

import java.util.Stack;

public class RemoveAdjDupStack {

    public static void main (String [] args){

        String str = "mississipie";

        Stack<Character> stack = new Stack<>();

        int i = 0;

        while (i < str.length()){

            char c = str.charAt(i);

            if(!stack.isEmpty() && stack.peek() == c){
                stack.pop();
            } else {
                stack.push(c);
            }

            i++;

        }

        StringBuilder res = new StringBuilder();

        while (!stack.isEmpty()){
            res.append(stack.pop());
        }

        System.out.println("Ans : "+ res.reverse().toString());



    }
}
