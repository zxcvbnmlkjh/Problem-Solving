package Serailization;

import Immutability.Employee;

import java.io.Serial;
import java.io.Serializable;

public class EmployeeObj implements Serializable
{
    private int id;
    private String name;

    EmployeeObj(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Object readResolve() {
        return this;
    }
}
