package src;

public class Test
{
    public static void main (String[] args)
    {
        Test test = new Test();
        String[] res = test.solution(10);
        for(String s : res) {
            System.out.print(s);
            System.out.print("\n");
        }

    }

    String[] solution(int n) {

        String[] resArray  = new String[n];
        StringBuffer sb = new StringBuffer();

        System.out.println("n is " + n);
        for(int i=0 ; i < n ; i++) {
            sb.append("*");
        }

        System.out.println("n is " + sb.toString());
        resArray[0] = sb.toString();

        for(int j=1 ;j<n-1 ; j++) {
            StringBuffer sb1 = new StringBuffer();
            sb1.append("*");
            for(int k=1 ; k<n-1 ; k++){
                sb1.append(" ");
            }
            sb1.append("*");
            resArray[j] = sb1.toString();
        }

        StringBuffer sb2 = new StringBuffer();
        for(int p=0 ; p<n ; p++) {
            sb2.append("*");
        }

        resArray[n-1] = sb2.toString();

        return resArray;

    }

}
