import java.util.ArrayList;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1st Question
        ArrayList<String> a = new ArrayList<String>();
        a.add("apple");
        a.add("banana");
        a.add("cherry");
        a.add("mango");
        a.add("apple");
        
        System.out.println(a);
        
        //2nd Question
        a.remove(0); 
        System.out.println(a);
        
        //3rd Question
       if(a.contains("orange")) {
    	   System.out.println("Orange is found in the list.");
       }else {
    	   System.out.println("Orange is found in the list.");
       }
       
       //4th Question
       System.out.println(a.size());
       
       //5th Question
       for(int i=0; i<a.size(); i++){
           
          String Fruitsnames = a.get(i);
          int Fruitsindex = a.indexOf(Fruitsnames);
           System.out.println(Fruitsindex+ " " + Fruitsnames);
       }

	}

}
