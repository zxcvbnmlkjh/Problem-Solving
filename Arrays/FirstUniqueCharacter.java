public class FirstUniqueCharacter
{
    public static void main (String[] args)
    {
        FirstUniqueCharacter firstUniqueCharacter = new FirstUniqueCharacter();
        System.out.println(firstUniqueCharacter.checkCharacter("aleetlcode"));
    }
    public int checkCharacter (String s) {
        int temp[] = new int[26];

        for(int i=0; i<s.length(); i++){
            temp[s.charAt(i)-'a']++;
        }
        for(int i=0; i<s.length(); i++){
            if(temp[s.charAt(i)-'a']==1) return i;
        }
        return -1;
    }
}
