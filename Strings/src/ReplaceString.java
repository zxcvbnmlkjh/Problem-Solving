import java.util.ArrayList;
import java.util.List;

public class ReplaceString
{
    public static void main (String[] args)
    {
        ReplaceString replaceString = new ReplaceString();
        System.out.println("Updated String:"+ replaceString.replace("AFoxxRunsFoxxInTheFieldFoxx", "Foxx", "Cat"));
    }

    public String replace (String mainString, String find, String replaceStr) {

        char[] mainStr = mainString.toCharArray();
        char[] first = find.toCharArray();

        List<Integer> indexList = new ArrayList<>();

        int i =0;

        String resultString = "";
        StringBuilder sb = new StringBuilder(resultString);
       while(i < mainStr.length)
        {
            if(mainStr[i] == (first[0])) {
                int endindex = find.length() + i;
                String str = mainString.substring(i,endindex);
                if(str.equals(find)) {
                    indexList.add(i);
                    sb.append(replaceStr);
                    i = i + find.length();
                } else {
                    sb.append(mainStr[i]);
                    i++;
                }
            } else {
                sb.append(mainStr[i]);
                i++;
            }
        }


        return sb.toString();
    }
}
