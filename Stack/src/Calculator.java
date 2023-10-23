package src;

import java.util.Stack;

public class Calculator
{
    public static void main (String[] args)
    {
        Calculator c = new Calculator();
        System.out.println(c.calculate("3+2*2"));
    }

    public int calculate (String s)
    {
        char ch[] = s.toCharArray();
        int num = 0;
        Stack<Integer> st = new Stack();
        char operator = '+';

        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i]))
                num = num * 10 + ch[i] - '0';
            if (!Character.isDigit(ch[i]) && ch[i] != ' ' || i == ch.length - 1) {
                if (operator == '+')
                    st.push(num);
                else if (operator == '-')
                    st.push(-num);
                else if (operator == '*')
                    st.push(st.pop() * num);
                else if (operator == '/')
                    st.push(st.pop() / num);
                num = 0;
                operator = ch[i];

            }
        }

        int sum = 0;
        while (!st.isEmpty()) {
            sum += st.pop();
        }

        return sum;
    }
}
