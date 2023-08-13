public class StringTest
{
    public static void main (String[] args)
    {
        String name = "Priyanka Taneja name";
        /*name = name.substring(1,5);
        System.out.println(name);*/
        StringBuffer sb = new StringBuffer(name);
        sb.append("djsjdskdjsk");
        String t = sb.substring(4);

        System.out.println(t);

        String str1 = new String("Hello");
        String str2 = new String("Hello");

        System.out.println(str1 == str2);


    }
}
