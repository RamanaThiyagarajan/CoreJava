
public class StaticVar {

	String name; // Instance variables
	String Address;
    static String City;
	static int i;
	static

	{
		i = 0;
		City = "Chennai";
	}

	StaticVar(String name, String Address) {

		this.name = name;
		this.Address = Address;
		i++;
		System.out.println(i);
	}

	public void getAddress() {

		System.out.println(Address + " " + City);
	}

	public static void getCity() {

		System.out.println(City); // If method is static then the variables also should be static
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVar ob = new StaticVar("Bob", "saidapet");
		StaticVar obj = new StaticVar("Ramana", "Guindy");
		ob.getAddress();
		obj.getAddress();
		StaticVar.getCity();

	}

}
