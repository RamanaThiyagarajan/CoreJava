
public class thisDemo {
	
	int a = 2;
	String name;
	
	thisDemo(String name){
		
		this.name=name;
		
	}
	
	public void nameData(){
		
		System.out.println(name);		
	}
	
	public void getData() {
		int a=3;
		int b= a+this.a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisDemo td = new thisDemo("Ramana");
		td.getData();
		td.nameData();	

	}

}
