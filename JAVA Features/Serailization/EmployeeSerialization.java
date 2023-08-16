package Serailization;

import Immutability.Employee;

import java.io.*;

public class EmployeeSerialization
{
    public static void main (String[] args) throws IOException, ClassNotFoundException
    {
       EmployeeObj emp = new EmployeeObj(1, "zcxxccc");
        FileOutputStream fout = new FileOutputStream("file.txt");

        ObjectOutputStream out = new ObjectOutputStream(fout);

        out.writeObject(emp);
        out.flush();
        out.close();

        System.out.println("Serialization successful");

        System.out.println( emp);

        FileInputStream fileIn = new FileInputStream("file.txt");
        ObjectInputStream in = new ObjectInputStream(fileIn);

        EmployeeObj emp1 = (EmployeeObj)in.readObject();
        in.close();

        System.out.println("Deserialization successful");

        System.out.println( emp1);

    }
}
