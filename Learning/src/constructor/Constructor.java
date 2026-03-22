package constructor;
class Person {
    String name;
    
    // Constructor
    Person(String n) {
        name = n;
    }

    void display() {
        System.out.println("Name: " + name);
    }
public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p=new Person("maran");
//		p.name="maran";
		p.display();

	}

}
