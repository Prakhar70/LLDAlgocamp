package Solid.Example1.ProblematicCode;

public class Employee {
    private int id;
    private String name;
    private String address;
    
    public Employee(int id, String name, String address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public void printPerformanceReport(){
        // Code to print performance report
        System.out.println("Performance report of employee: " + name);
    }
    public double computeSalary(){
        // Code to compute salary
        return 1000.0;
    }
    public void updateEmployeeData(){
        // Code to update employee data
        System.out.println("Employee data updated");
    }
    public void fetchEmployeeData(){
        // Code to fetch employee data
        System.out.println("Employee data fetched");
    }
}