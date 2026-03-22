package Set;

import java.util.*;

public class h2_hashEx1 {
    public static void main(String args[]) {
        // Key: Integer (ID), Value: String (Name)
        Map<Integer, String> Student = new HashMap<>();

        Student.put(101, "Darmick");
        Student.put(102, "Gopi");
        Student.put(103, "Hari");
        Student.put(104, "JS");
        Student.put(105, "aravid");
        Student.put(106, "pritvi");
        Student.put(107, "manoj");
        Student.put(108, "naveen");
        Student.put(109, "thiru");
        Student.put(110, "karthik");
        Student.put(111, "ironman");
        Student.put(112, "spiderman");
        Student.put(113, "batman");
        Student.put(114, "blackwidow");
        Student.put(115, "drstrange");
        Student.put(116, "captain");
        Student.put(117, "hawkeye");


        // Show how each key maps to a bucket (0 to 15)
        System.out.println("\n");
        for (Integer key : Student.keySet()) 
        {
            int bucket = key % 16;  // Manually simulate HashMap bucket
            System.out.println(key + "\t→\t" + bucket);
        }
        System.out.println("\n");
        System.out.println(Student);
        
    }
}
