
public class ConstructDemo {
	
	public ConstructDemo() {
		
		System.out.println("I am a Constructor");
		
	}
	
	public ConstructDemo(int a, int b) {
		
		System.out.println("I am a Parameterized Constructor");
	}
	
public ConstructDemo(String str) {
		
		System.out.println(str);
	}
	
	public void getData() {
		
		System.out.println("I am the method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//will not return values
		//name of the constructor should be the class name
		//whenever the Object is created, Constructor is called
		//Whenever constructor is not created, Compiler will call default constructor
		
		ConstructDemo cd= new ConstructDemo();
		ConstructDemo c= new ConstructDemo(4,5);
		ConstructDemo cds= new ConstructDemo("Hello");
		
	}

}
