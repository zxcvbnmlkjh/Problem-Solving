
public class StackOperations {

    public static void main(String[] args) {
        Stack1 stack = new Stack1(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}

class Stack1 {
        int[] arr;
        int top = -1;

    Stack1(int size)
    {
        arr = new int[size];
    }

    public void push (int num) {
        if(isFull()) {
            System.out.println("Stack is full");
        } else {
            arr[++top] = num;
        }
    }

    public void pop() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Element popped id :" + arr[top--]);
        }
    }

    public boolean isEmpty() {
        if(top<0){
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if(top == arr.length-1) {
            return true;
        } else {
            return false;
        }
    }
}
