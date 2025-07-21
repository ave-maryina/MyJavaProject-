package phoneBook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<String>> entries = new HashMap<>();

    public void addEntry(String lastName, String phoneNumber) {
        entries.computeIfAbsent(lastName, k -> new ArrayList<>()).add(phoneNumber);
    }

    public List<String> getNumbers(String lastname) {
        return entries.get(lastname);
    }

    public Map<String, List<String>> getEntries() {
        return entries;
    }
}
