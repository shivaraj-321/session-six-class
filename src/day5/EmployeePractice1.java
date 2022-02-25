package day5;

import java.time.LocalDate;
import java.util.logging.Logger;

public class EmployeePractice1 {
    private  String name; //required
    private double salary; //required
    private LocalDate joiningDate; // required
    private int age;  // optional

//    public EmployeePractice1(){
//        Logger.getGlobal().info("Constructor called");
//    }
    public EmployeePractice1(String name, double salary, LocalDate joiningDate){
        this.name = name;
        this.salary = salary;
        this.joiningDate = joiningDate;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public int getAge() {
        return age;
    }
}
