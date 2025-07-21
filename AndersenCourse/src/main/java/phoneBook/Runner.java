package phoneBook;

public class Runner {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        System.out.println(phoneBook.getEntries());
        phoneBook.addEntry("Petrov", "+375442090009");
        phoneBook.addEntry("Petrov", "+375292090000");
        phoneBook.addEntry("Ivanov", "+375332000000");
        System.out.println(phoneBook.getEntries());
        System.out.println(phoneBook.getNumbers("Petrov"));
    }
}
