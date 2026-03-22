package Constructor;

public class Constructor {
	    private int myInt;
	    private String myString;

	    // This class does not define any constructors

	    public static void main(String[] args) {
	        // Creating an object of MyClass using the default constructor
	    	 Constructor obj = new  Constructor();

	        // Accessing member variables
	        System.out.println("Default value of myInt: "+obj.myInt);   
	            // Output: Default value of myInt: 0
//	        System.out.println("Default value of myString: "+obj.myString);
	        // Output: Default value of myString: null
	    }
	}

	


