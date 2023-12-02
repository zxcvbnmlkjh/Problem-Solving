public class LeftRotateArray
{
    public static void main (String[] args)
    {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        LeftRotateArray sol = new LeftRotateArray();
        int[] resArray = sol.findReverse(arr, 3);
        for (int i : resArray) {
            System.out.print(i);
        }
    }
            public int[] findReverse(int[] arr, int steps) {

                if(arr.length == 0) {
                    return null;
                }
                // Reverse
                int left = 0;
                int right = arr.length-1;

                while(left<=right) {
                    int temp = arr[left];
                    arr[left] = arr[right];
                    arr[right] = temp;
                    left ++;
                    right--;
                }


                for(int i : arr) {
                    System.out.print(i + " ");
                }

                int pos = arr.length - steps;

                int leftptr = 0;
                int rightptr = pos-1;

                // Reverse first half
                while(leftptr<=rightptr) {
                    int temp = arr[leftptr];
                    arr[leftptr] = arr[rightptr];
                    arr[rightptr] = temp;
                    leftptr ++;
                    rightptr--;
                }

                int leftAdd = pos;
                int righAdd = arr.length-1;

                // Reverse second half
                while(leftAdd<= righAdd) {
                    int temp = arr[leftAdd];
                    arr[leftAdd] = arr[righAdd];
                    arr[righAdd] = temp;
                    leftAdd ++;
                    righAdd--;
                }

                return arr;

            }
        }
