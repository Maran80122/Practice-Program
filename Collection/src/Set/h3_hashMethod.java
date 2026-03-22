package Set;


import java.util.*;

public class h3_hashMethod {
    public static void main(String args[]) {

        // Create a HashMap to store Employee ID and Name
        Map<Integer, String> Employee = new HashMap<>();

        // 🔹 1. put(key, value)
        // Add key-value pairs to the HashMap
        Employee.put(101, "johnwick");
        Employee.put(102, "Creed");
        Employee.put(103, "leo");
        Employee.put(104, "kunal");
        Employee.put(105, "asha");
        Employee.put(106, "steve");
        Employee.put(107, "dustin");
        Employee.put(108, "mikey");
        Employee.put(109, "rickey");
        Employee.put(110, "michael");
        Employee.put(111, "Ironman");  
        Employee.put(112, "john");
        Employee.put(113, "robert");
        Employee.put(114, "peter");
        Employee.put(115, "emma");
        Employee.put(116, "billy");
        Employee.put(117, "randy");

        System.out.println("🔹 Initial Employee Map:");
        System.out.println(Employee);
        System.out.println();

        // 🔹 2. get(key) 
        // Get value using a key
        System.out.println("Get value for key 110: " + Employee.get(110));  // Output: michael

        // 🔹 3. remove(key)
        // Remove key-value pair by key
        System.out.println(" Removing key 103: " + Employee.remove(103));  // Output: leo
        System.out.println("After removal of key 103:");
        System.out.println(Employee);
        System.out.println();

        // 🔹 4. containsKey(key)
        // Check if a key exists
        System.out.println(" Does key 105 exist? " + Employee.containsKey(105)); // true
        System.out.println(" Does key 200 exist? " + Employee.containsKey(200)); // false

        // 🔹 5. containsValue(value)
        // Check if a value exists
        System.out.println(" Does value 'Ironman' exist? " + Employee.containsValue("Ironman")); // true
        System.out.println(" Does value 'Thor' exist? " + Employee.containsValue("Thor")); // false

        // 🔹 6. isEmpty()
        // Check if the HashMap is empty
        System.out.println(" Is HashMap empty? " + Employee.isEmpty()); // false

        // 🔹 7. size()
        // Get total number of entries
        System.out.println(" Total Employees: " + Employee.size()); // Should be 16 after removal

        // 🔹 8. keySet()
        // Get all keys
        System.out.println(" All Employee IDs (keys): " + Employee.keySet());

        // 🔹 9. values()
        // Get all values
        System.out.println(" All Employee Names (values): " + Employee.values());

        // 🔹 10. entrySet()
        System.out.println( Employee.entrySet());
        // Loop through key-value pairs
        System.out.println(" All Entries (Key-Value Pairs):");
        for (Map.Entry<Integer, String> entry : Employee.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }

        // 🔹 11. clear()
        // Clear all entries from HashMap
        Employee.clear();
        System.out.println(" After clear(): " + Employee); // Should print empty {}
    }
}
