package PolyMorphism;

public class PolyMain
{
    public static void main (String[] args)
    {
        EmployeeAddress employee = new EmployeeAddress();
        employee.createEmp(1);
        Address address = new EmployeeAddress();
        address.addAddress();
    }
}
