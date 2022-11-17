package Abstract;

public class KIA extends Car{

    KIA() {
        super(123);
        System.out.println("M in KIA constructor");

    }

    @Override
    public void buy() {
        System.out.print(num);
        System.out.print("M buying KIA");
    }
}
