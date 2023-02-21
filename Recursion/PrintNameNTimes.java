public class PrintNameNTimes
{
    public static void main(String[] args) {
        PrintNameNTimes print = new PrintNameNTimes();
        print.printName("Priyanka", 1,5);

    }
    public void printName(String name, int i, int n) {

        if(i>n){
            return;
        }
        System.out.println(name);
        printName(name, i+1, n);
    }
}
