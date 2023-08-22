package TwoPointer;

public class CheckSubString
{

    public static void main (String[] args)
    {
        CheckSubString checkSubString = new CheckSubString();
        System.out.println(checkSubString.canMakeSubsequence("abc", "ad"));
    }
        public boolean canMakeSubsequence(String str1, String str2) {

            int i =0;
            int j = 0;
            boolean res = false;
            while (i< str1.length() && j < str2.length()) {

                char ch1 = str1.charAt(i);
                char ch2 = str2.charAt(j);


                if(ch1 == ch2 || ch1+1 == ch2 || ch1-25 == ch2) {
                    i++;
                    j++;
                } else {
                    i++;

                }

            }
            if(j>=str2.length()) {
                res =  true;
            }
            return res;

        }
    }
