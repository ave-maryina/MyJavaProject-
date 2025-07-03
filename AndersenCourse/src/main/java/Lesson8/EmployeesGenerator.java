package Lesson8;

public class EmployeesGenerator {
    public static Employee[] generateEmployees() {
        Employee[] emplArray = new Employee[5];
        emplArray[0] = new Employee("Vasiliy Utkin", "AQA engineer", "vas999@gmail.com", "+375298007009", 909998, 33);
        emplArray[1] = new Employee("Vasilisa Utkina", "designer", "vasUtk00@gmail.com", "+375338047713", 302421, 50);
        emplArray[2] = new Employee("Artyom Swetlichny", "developer", "swetlArt@gmail.com", "+375337899004", 990990, 40);
        emplArray[3] = new Employee("Ruslan Voronov", "system administrator", "voronovR@gmail.com", "+375298009899",207900, 41);
        emplArray[4] = new Employee("Katerina Kovaleva", "manager", "katsyK@gmail.com", "+375445009878", 150000, 45);
        return emplArray;
    }
}
