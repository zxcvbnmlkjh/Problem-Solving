/**
 *
 * https://leetcode.com/problems/min-stack/description/?envType=featured-list&envId=top-interview-questions%3FenvType%3Dfeatured-list&envId=top-interview-questions
 *
 * https://www.youtube.com/watch?v=wePWCZjtrOo
 *
 * Need to perform all stack operations
 * push pop min in O(1) time complexity
 *
 * Solution we will maintain 2 different stacks one which will handle MinValues and other that will perform push n pop.
 *
 */
package src;

import java.util.Stack;

public class MinStack
{
    Stack<Integer> minS = new Stack<>();
    Stack<Integer> stack = new Stack<>();
    public static void main (String[] args)
    {
        MinStack minStack = new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
        minStack.pop();
        minStack.getMin();
    }

    public void push(int val) {
        System.out.println("Pushed value is" + val);

        if(minS.isEmpty() || minS.peek() >= val) {
            minS.push(val);
        }
        stack.push(val);
    }

    public void pop() {
        System.out.println("Poped value is" + stack.peek());
        if(stack.peek().equals(minS.peek())){
            stack.pop();
            minS.pop();
        } else {
            stack.pop();
        }
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        System.out.println("Fetched min is"+ minS.peek());
        return minS.peek();
    }
}

