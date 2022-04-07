package at.campus02.emp;

import java.util.Objects;

public class Employee {

    private int empNumber;
    private  String name;
    private double salari;
    private String department;

    //konstruktor

    public Employee(int empNumber, String name, double salari, String department) {
        this.empNumber = empNumber;
        this.name = name;
        this.salari = salari;
        this.department = department;
    }

    //Get/set

    public int getEmpNumber() {
        return empNumber;
    }

    public String getName() {
        return name;
    }

    public double getSalari() {
        return salari;
    }

    public String getDepartment() {
        return department;
    }

    //neue methoden soll uberprufen ob 2 mittarbeiter in gleichen departman arbeiten
    //true zuruckliefern falls ja, folse falls nein

    public boolean compareDepartment(Employee e){
        if(department.equals(e.department)){
            return true;
        }
            return false;
    }

    public void setSalari(double salari) {
        this.salari = salari;
    }

    public void setDepartment(String department) {
        this.department = department;
    }




    @Override
    public String toString() {
        return "Employee{" +
                "empNumber=" + empNumber +
                ", name='" + name + '\'' +
                ", salari=" + salari +
                ", department='" + department + '\'' +
                '}';
    }
//ovo smo generisali
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  //this ist referenz, vergeleiche referenzen, ob objekts zeigen auf gleiche speicher adresse
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return empNumber == employee.empNumber && Objects.equals(department, employee.department);
    }
//ova metoda nam je bitna
    @Override
    public int hashCode() {
        return Objects.hash(empNumber, department);
    }
}
