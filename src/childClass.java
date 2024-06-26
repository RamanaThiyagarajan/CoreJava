
public class childClass extends parentClass {

	String name= "Rahul";
	
	public childClass(){
		super();
		System.out.println("I am a child class constructor");
	}
	public void getStringData() {
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData() {
		
		super.getData();
		System.out.println("I am a child class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childClass cd= new childClass();
		cd.getStringData();
		cd.getData();

	}

}
