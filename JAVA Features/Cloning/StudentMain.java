/**
 * This is an example of Shallow Cloning which is by default one.
 *
 * For Primitive data types it provides cloning by default using overriden clone method.
 */
package Cloning;

public class StudentMain
{
    public static void main (String[] args) throws CloneNotSupportedException
    {
        System.out.println("Shallow Clone=================");
        Student student = new Student(1, "Priyanka");
        System.out.println("Obj before clone"+ student);
        // Here we have done Shallow Clone
        Student s2 = (Student) student.clone();
        s2.name = "Sneha";
        System.out.println("Obj after clone"+ s2);

        // Here we have done Deep Clone

        System.out.println("Deep Clone=================");

        StudentAddress address = new StudentAddress(1, "Delhi");
        StudentDeep studentDeep1 = new StudentDeep(12, "Sneha", address);

        System.out.println("Obj before clone"+ studentDeep1);

        StudentDeep studentDeep2 = (StudentDeep) studentDeep1.clone();
        studentDeep2.address.cityName= "Bangalore";

        System.out.println("Obj after clone first obj"+ studentDeep1); // Here this is breaking as for Objects we need Deep clone.

        System.out.println("Obj after clone second obj"+ studentDeep2);
    }
}
