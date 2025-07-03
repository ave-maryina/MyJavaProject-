package Lesson8;

public class Organization {
    private Employee[] employees;

    public Organization(Employee[] employees) {
        this.employees = employees;
    }

    public Organization() {
    }

    public void printEmployeesOverForty() {
        for(Employee emp : employees) {
            if(emp.getAge() > 40) {
                emp.getEmployeeInfo();
            }
        }
    }
}
