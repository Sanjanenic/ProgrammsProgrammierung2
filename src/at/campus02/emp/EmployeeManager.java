package at.campus02.emp;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager {

    //nicht static dazu schreiben wenn in aufgabe steht so nicht
    //emploeeys ist name von List
    private ArrayList<Employee> employees= new ArrayList<>();

    // oder in construktor machen wir
    //constructor:
    public EmployeeManager(){
        employees=new ArrayList<>();
    }

    //ovako pristupamo employeesjer je privatna
    public void addEmployee(Employee e){
employees.add(e);

    }

    public Employee findByEmpNumber(int number) {
        for (Employee empi : employees) {
            if (empi.getEmpNumber() == number) {
                return empi;
            }


        }
        return null;
    }
public ArrayList<Employee> findeByDepartment(String department){
            //pomocna
            ArrayList<Employee> erg = new ArrayList<>();

            for (Employee e: employees){
                if(e.getDepartment().equals(department)){
                    erg.add(e);
                }
            }

            return erg;
        }

        public Employee findByMaxSalary(){

        Employee e11 =null;
        int highestSalary= 0;  //oder -1

            for(Employee e : employees){
                if(e.getSalari() > highestSalary){
                    highestSalary= (int) e.getSalari(); //ovdje je trazio Cast
                    e11=e;
                }

            }


     return e11;
}

}
