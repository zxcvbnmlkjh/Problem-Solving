// To check next smaller element of an array start from the end and start traversiong towards left and find next smallest element.
import java.util.Stack;

public class NextSmallerElement
{
    public static void main(String[] args) {
        int[] arr = {2,1,5,6,2,3,1};
        NextSmallerElement nse = new NextSmallerElement();
        int[] res = nse.getNextSmallerArray(arr);
        for(int i=0; i<res.length;i++){
            System.out.print(res[i] + " ");
        }
    }

    public int[] getNextSmallerArray(int[] arr) {
        int[] res = new int[arr.length];
        Stack<Integer> stack = new Stack<>();
        for(int i=arr.length-1; i>=0; i--) {
            while(!stack.isEmpty() && stack.peek()>= arr[i]) {
                stack.pop();
            }
            if(stack.isEmpty()) {
                res[i] = -1;
            } else {
                res[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return res;
    }
}
