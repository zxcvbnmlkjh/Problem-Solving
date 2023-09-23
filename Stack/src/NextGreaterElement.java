import java.util.Stack;

public class NextGreaterElement
{

    public static void main(String[] args)
    {
        int[] arr = {1,3,4,2};   //{3,4,-1,-1}
        NextGreaterElement ng = new NextGreaterElement();
        int[] result = ng.getArray(arr);

        int j = 0;
        while(j< result.length) {
            System.out.print(result[j] + " ");
            j++;
        }
    }

    public int[] getArray (int[] arr)
    {
        int[] result = new int[arr.length];
        Stack<Integer> stack = new Stack<>();

        for(int i=arr.length-1; i>=0; i--)
        {
            while (!stack.isEmpty() && stack.peek()<arr[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                result[i] = -1;
            } else {
                result[i] = stack.peek();
            }
            stack.push(arr[i]);
        }
        return result;
    }
}
