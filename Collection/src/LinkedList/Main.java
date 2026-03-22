package LinkedList;

import java.util.LinkedList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<String> cars = new LinkedList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    cars.removeFirst();
    cars.removeLast();
    cars.addFirst("Benz");
    cars.addLast("swift");
    System.out.println(cars.getFirst());
    System.out.println(cars.getLast());
    
    System.out.println(cars);
  }
}
