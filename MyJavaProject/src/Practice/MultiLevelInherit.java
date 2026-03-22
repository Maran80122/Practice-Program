package Practice;
class Animal {
    public void eat() {
        System.out.println("Animals eats food");
    }
}
class Mammals extends Animal {
    public void walk() {
        System.out.println("mammals walks in leg");
    }
}
class Dog extends Mammals {
    public void bark() {
        System.out.println("dog is a bark");
    }
}

public class MultiLevelInherit {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Dog d = new Dog();
        d.bark();
        d.walk();
//        d.bark();
    }
}
