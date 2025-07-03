package Lesson8;

public class Runner {
    public static void main(String[] args) {
        Organization organization = new Organization(EmployeesGenerator.generateEmployees());
        organization.printEmployeesOverForty();
    }
}
