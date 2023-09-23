package src;

import java.util.Stack;

public class ParanthesisBalance {
        public boolean isValid(String s) {

            char[] ch = s.toCharArray();
            Stack<Character> stack = new Stack();
            int len = ch.length;
            char chh;
            for(int i=0;i<ch.length;i++) {

                if(ch[i] == '{' || ch[i] == '(' || ch[i] == '[')
                {
                    stack.push(ch[i]);
                    continue;
                }

                if(stack.isEmpty())
                {
                    return false;
                }

                switch (ch[i]) {


                    case '}' :

                        chh = stack.pop();
                        if(chh == '(' || chh == '[')
                            return false;
                        break;

                    case ']' :

                        chh = stack.pop();
                        if(chh == '(' || chh == '{')
                            return false;
                        break;

                    case ')'  :

                        chh = stack.pop();
                        if(chh == '[' || chh == '{')
                            return false;
                        break;
                }
            }
            return stack.isEmpty();
        }
    }

 class StackOps
{
    public static void main(String[] args) {
        ParanthesisBalance pb  = new ParanthesisBalance();
        System.out.println(pb.isValid("[]"));
    }
}
