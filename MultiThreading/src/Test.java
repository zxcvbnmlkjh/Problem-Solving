public class Test
{
    private static Test testObj;


    private Test () {

    }

    public static Test getTest ()
    {
        if(testObj == null ) {
            synchronized (Test.class) {
                if (testObj == null) {
                    testObj = new Test();
                }
            }
        }
        return testObj;
    }
}

