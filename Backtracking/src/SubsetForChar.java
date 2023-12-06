import java.util.ArrayList;
import java.util.List;

public class SubsetForChar
{
    List<String> resultList = new ArrayList<>();
    public static void main (String[] args)
    {
        char[] arr = {'a','a', 'b', 'c'};
        SubsetForChar findingSubSetPowerSet = new SubsetForChar();
        findingSubSetPowerSet.findSet(0, arr.length, new ArrayList<>(), arr);
        for(String s: findingSubSetPowerSet.resultList) {
            System.out.println(s);
        }
    }

    public void findSet (int index , int len, List<Character> tempList , char[] arr) {

        // Here we are creating new list and copyting data to it and adding to resultList
        // if we use same reference will be passed and it will change the values.
        if(index == len) {
            StringBuilder sb = new StringBuilder();
            for(char c : tempList) {
                sb.append(c);
            }
            String s = sb.toString();
            String s1 = sb.reverse().toString();
            if(s1.equals(s)) {
                resultList.add(s);
            }
            return;
        }

        // Include
        tempList.add(arr[index]);
        findSet(index+1, len, tempList, arr);

        // Remove Last element
        tempList.remove(tempList.size()-1);

        //Exclude
        findSet(index+1, len, tempList, arr);
    }
}
