package at.campus02.emp;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoEmp {
    public static void main(String[] args) {

        Employee e1 = new Employee(1, "Markus", 5400.0, "Buchhaltung");
        Employee e2 = new Employee(2, "Anna",5400.50,"Administration");
        Employee e3 = new Employee(3, "Luca",5000.50,"Buchhaltung");

EmployeeManager mgr= new EmployeeManager();

mgr.addEmployee(e1);
mgr.addEmployee(e2);
mgr.addEmployee(e3);

        System.out.println(mgr.findByEmpNumber(1));
        System.out.println(mgr.findeByDepartment("Buchhaltung"));
        System.out.println(mgr.findByMaxSalary());






    }
}
