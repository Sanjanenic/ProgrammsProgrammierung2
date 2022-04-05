package at.campus02.emp;

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
}
