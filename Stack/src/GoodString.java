package src;

import java.util.Stack;

public class GoodString
{
    public static void main (String[] args)
    {
        String s = "leEeetcode";

        GoodString goodString = new GoodString();
        System.out.println(goodString.findString(s));

    }

    public String findString (String s) {

        StringBuilder sb = new StringBuilder();
        if(s.isEmpty()) {
            return "";
        }
        char[] ch = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        stack.push(ch[0]);

        for(int i=1; i< ch.length; i++) {

            if(Character.isUpperCase(ch[i]) && Character.toLowerCase(ch[i]) == stack.peek() ) {
                  stack.pop();
            } else if(Character.isLowerCase(ch[i]) && Character.toUpperCase(ch[i]) == stack.peek()) {
                    stack.pop();
                }
            else {
                stack.push(ch[i]);
            }
        }

        while(!stack.isEmpty()) {
            char c = stack.pop();
            sb.append(c);
        }

        return sb.reverse().toString();

    }
}
