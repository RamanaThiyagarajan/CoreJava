
public class overloading {
	
	//Function Overloading can be done in below 2 ways
	//Either Argument count should be different
	//Argument data type should be different
	
	public void getData(int a) { 
		
	System.out.println(a);
		
	}
	
	public void getData(int a, int b) { //by Changing the Number of parameters
		
		System.out.println(a);
		System.out.println(b);
		
	}
	
     public void getData(int b, String a) { //by Changing the Number of parameters with different data type
		
		System.out.println(a);
		System.out.println(b);
		
	}
     
     public void getData(String a,int b ) { //by Changing the Order of parameters
 		
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public void getData(String a) { //by Changing the type of parameters
		
		System.out.println(a);
	}
                                      
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		overloading a = new overloading();
		a.getData(1);
		a.getData(3, 4);
		a.getData("Hello");
		a.getData("Hello", 1);
		a.getData(2, "yes");

	}

}
