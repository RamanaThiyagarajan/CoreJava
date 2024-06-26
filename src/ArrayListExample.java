import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// can accept duplicate values 
		 //ArraList,LinkedList,vector- Implementing List interface
	     //array have fixed size where as arraylist can grow dynamicaly
		 //you can access and insert any value in any index private int i =5
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("Selenium");
		a.add("TestNG");
		a.add("java");
		System.out.println(a);
		a.remove(0); // this will remove the string that present in that index
		//a.remove("Java"); //this will remove the said word from the ArrayList
		a.add(0, "Automation");
		System.out.println(a.get(2)); //This will print the string that present in the given index		
		System.out.println(a.contains("TestNG")); //This will check whether the given String is present in the Arraylist
	    System.out.println(a.indexOf("Automation")); // This will get the Index of the given String
	    System.out.println(a.size()); // This will give the Total Size of the Arraylist
	    System.out.println(a.isEmpty()); //This wil check whether the Array is empty or not	
	  
	 
		

	}

}
