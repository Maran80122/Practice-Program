package PrimitiveToObject;

//Datatype    /     class
// byte            Byte
// short           Short
//long             Integer
//double           Double
//boolean           Boolean


					//It is used to convert all primitive datatype into object its corresponding datatypes through class

public class WrapperClassWhole {

	public static void main(String[] args) {
		byte b =10;
		short s =20;
		int i =30;
		long l =40;
		float f =50.F;
		double d =60.0D;
		char c= 'a';
		boolean b2 = true;
		
//			Autoboxing: converting primitive datatype into objects
		
				Byte byteobj=b;
				Short shortobj=s;
				Integer intobj=i;
				Long longobj=l;
				Float floatobj=f;
				Double doubleobj=d;
				Character charobj=c;
				Boolean boolobj=b2;
				
				
//				printing objects
				
				
				System.out.println("-----Printing object valuse--------");
				System.out.println("Byte object:"+byteobj);
				System.out.println("Short object:"+shortobj);
				System.out.println("Integer object:"+intobj);
				System.out.println("Long object:"+longobj);
				System.out.println("Float object:"+floatobj);
				System.out.println("Double object:"+doubleobj);
				System.out.println("Character object:"+charobj);
				System.out.println("Boolean object:"+boolobj);
				
						
//		unboxing:    converting object to primitive data types		
				
				byte bytevalue=byteobj;
				short shortvalue=shortobj;
				int intvalue=intobj;
				long longvalue=longobj;
				float floatvalue=floatobj;
				double doublevalue=doubleobj;
				char charvalue= charobj;
				boolean boolvalue=boolobj;
				
				
	//  Printing primitives
				
				System.out.println("-----Printing oprimitive valuse--------");
				System.out.println("byte object:"+bytevalue);
				System.out.println("short object:"+shortvalue);
				System.out.println("integer object:"+ intvalue);
				System.out.println("long object:"+longvalue);
				System.out.println("float object:"+floatvalue);
				System.out.println("double object:"+doublevalue);
				System.out.println("character object:"+charvalue);
				System.out.println("boolean object:"+boolvalue);
				
				

	}

}
