package Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        // Initialize TreeSet
        TreeSet<String> set = new TreeSet<>();

        // 1. Insert Elements (add, addAll)
        set.add("C");
        set.add("A");
        set.add("E");
        set.add("B");
        set.add("D");
        System.out.println("After add(): " + set);

        TreeSet<String> moreLetters = new TreeSet<>();
        moreLetters.add("F");
        moreLetters.add("G");

        set.addAll(moreLetters);
        System.out.println("After addAll(): " + set);

        // 2. Access Elements using for each
        System.out.println("\nAccess using for-each:");
        for (String i : set) {
            System.out.print(i + " ");
        }

        // 3. Remove Elements (remove, removeAll)
        set.remove("C");
        System.out.println("\n\nAfter remove('C'): " + set);

        TreeSet<String> toRemove = new TreeSet<>();
        toRemove.add("A");
        toRemove.add("B");
        set.removeAll(toRemove);
        System.out.println("After removeAll([A, B]): " + set);

        // 4. first() and last()
        System.out.println("\nFirst Element: " + set.first());
        System.out.println("Last Element: " + set.last());

        // 5. ceiling(), floor(), higher(), lower()
        System.out.println("\nCeiling of 'D': " + set.ceiling("D"));
        System.out.println("Floor of 'F': " + set.floor("F"));
        System.out.println("Higher than 'E': " + set.higher("E"));
        System.out.println("Lower than 'E': " + set.lower("E"));
        
        // 6. descendingSet() Method
        System.out.println("\nDescendingSet(): " + set.descendingSet());

        // 7. pollFirst(), pollLast()
        System.out.println("\nPollFirst(): " + set.pollFirst());
        System.out.println("PollLast(): " + set.pollLast());
        System.out.println("After polling: " + set);

        // 8. headSet(), tailSet(), and subSet() Methods
        System.out.println("\n--- View-based Methods ---");
        // Let’s first clear and re-add elements to avoid pollFirst/pollLast removals affecting result
        set.clear();
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("F");

        System.out.println("TreeSet: " + set);

        // headSet(D) → elements less than D
        System.out.println("headSet(\"D\"): " + set.headSet("D"));
        
        // tailSet(D) → elements greater than or equal to D
        System.out.println("tailSet(\"D\"): " + set.tailSet("D"));

        // subSet(E1, E2) → elements from E1 (inclusive) to E2 (exclusive)
        System.out.println("subSet(\"B\", \"E\"): " + set.subSet("B","E"));
        
     // 9. Set Operations
        System.out.println("\n--- Set Operations ---");

        // Create first TreeSet: set1
        TreeSet<String> set1 = new TreeSet<>();
        set1.add("A");
        set1.add("B");
        set1.add("C");
        System.out.println("Set1: " + set1);

        // Create second TreeSet: set2
        TreeSet<String> set2 = new TreeSet<>();
        set2.add("B");
        set2.add("C");
        set2.add("D");
        System.out.println("Set2: " + set2);

        // Union (all elements from both sets)
        TreeSet<String> union = new TreeSet<>();
        union.addAll(set1);
        union.addAll(set2);
        System.out.println("Union: " + union);

        // Intersection (common elements)
        TreeSet<String> intersection = new TreeSet<>();
        intersection.addAll(set1); 
        intersection.retainAll(set2);
        System.out.println("Intersection: " + intersection);

        // Difference (elements in set1 but not in set2)
        TreeSet<String> difference = new TreeSet<>();
        difference.addAll(set1);
        difference.removeAll(set2);
        System.out.println("Difference (Set1 - Set2): " + difference);

        // Subset Check (is set1 a subset of set2?)
        boolean isSubset = set2.containsAll(set1);
        System.out.println("Is Set1 a subset of Set2? " + isSubset);

    }
}

