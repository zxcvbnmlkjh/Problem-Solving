import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MicroSoftAssignment
{
    public static void main (String[] args)
    {
        MicroSoftAssignment ms = new MicroSoftAssignment();
        System.out.print(ms.countCheck("ABCabcAefG"));
    }
    public int countCheck(String s) {
        int count = 0;
        char[] charArray = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap();
        int i = 0;
        for(char ch : charArray) {
            if(Character.isLowerCase(ch)) {
                map.put(ch, i);
            } else if(Character.isUpperCase(ch)) {
                if(!map.containsKey(ch)) {
                    map.put(ch, i);
                }
            }
            i++;
        }

        for(Map.Entry<Character,Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
            if(Character.isUpperCase(entry.getKey())) {
                if(map.containsKey(Character.toLowerCase(entry.getKey()))) {
                    int lval = map.get(Character.toLowerCase(entry.getKey()));
                    int uval = entry.getValue();
                    if (lval < uval) {
                        System.out.println("Matching value:" + entry.getKey() + " " + entry.getValue());
                        count++;
                    }
                }
            }
        }
        return count;
    }
}
