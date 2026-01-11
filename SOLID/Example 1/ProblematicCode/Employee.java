package ProblematicCode;

//Problem with this class is that it is doing too many things
//Because the below class is trying to do to many things thats why we need to change this class

public class Employee {

    private String employeeId;
    private String name;
    private String email;

    public Employee(String employeeId, String name, String email) {
        this.employeeId = employeeId;
        this.name = name;
        this.email = email;
    }

    // If the report format changes we might need to update the
    // printPerformanceReport method
    public void printPerformanceReport() {
        System.out.println("Printing performance report");
    }

    // If the taxation changes we might need to update the computeSalary method

    public void computeSalary() {
        System.out.println("Computing salary");
    }

    public void fetchEmployeeData() {
        System.out.println("Fetching employee data");
    }

    public void saveEmployeeData() {
        System.out.println("Saving employee data");
    }

    // If data save requirement changes we might need to update the saveEmployeeData
    // method

    public void updateEmployeeData(String email) {
        System.out.println("Updating employee data");
    }

}