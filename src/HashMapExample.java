import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "selenium");
		hm.put(1, "Automation");
		hm.put(2, "Cypress");
		hm.put(3, "Automation");
		System.out.println(hm.get(2));
		hm.remove(2);
		System.out.println(hm.get(2));
		Set hs= hm.entrySet(); //This method is used to convert hashmap in to set
		Iterator it= hs.iterator(); //after converting to set, Iterate the Set object
		while(it.hasNext()) { //While loop is used if Iterator has the next element- It will Print the values
			
			Map.Entry mp = (Map.Entry) it.next(); //This method is used to separate the key and value
			System.out.println(mp.getKey()); //This method will print the key 
			System.out.println(mp.getValue()); //This method will print the value
			
			//Difference between HashMap and HashTable
			
			//Multiple threads or Multiple program can be accessed in HashMap (Non Synchronized and not thread safe)
			//Only one thread or one program can be accessed at the time in HashTable (Synchronized and Thread safe)
			
			//HashMap allows one key and any number of null values
			//HashTable will not allow null keys and null values in the HashTable Project
			
			//HashMap Object values are iterated by using Iterator
			//HashTable Object values are iterated by using enumerator
			
		}
	}
}
