
public class childClassDemo extends parentClassDemo{
	
	//overriding
	public void audiosystem() {
		System.out.println("new audio system implemented");
	}
	
	public void engine() {
		
		System.out.println("New Engine code implemented");
	}
	
	public void colour() {
		
		System.out.println(colour);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		childClassDemo a = new childClassDemo();
		
		
		a.engine();
		a.colour();
		a.brakes();
		a.audiosystem();
	}

}
