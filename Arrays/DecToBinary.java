import java.util.LinkedList;
import java.util.List;

public class DecToBinary
{
    public static void main(String[] args) {
        int num = 2;
        DecToBinary dec = new DecToBinary();
        List<Integer> resultList = dec.decimalToBinary(num);
        for(int i=resultList.size()-1;i>=0;i--){
            System.out.print(resultList.get(i) +  );
        }
    }
    public List<Integer> decimalToBinary(int n) {
        List<Integer> list = new LinkedList<>();
        while(n>0) {
            list.add(n%2); // 0 1
            n = n/2;
        }
        return list;
    }
}
