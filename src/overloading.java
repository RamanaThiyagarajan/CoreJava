
public class overloading {
	
	//Function Overloading can be done in below 2 ways
	//Either Argument count should be different
	//Argument data type should be different
	
	public void getData(int a) {
		
	System.out.println(a);
		
	}
	
	public void getData(int a, int b) {
		
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public void getData(String a) {
		
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		overloading a = new overloading();
		a.getData(1);
		a.getData(3, 4);
		a.getData("Hello");

	}

}
