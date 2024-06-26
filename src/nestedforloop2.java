
public class nestedforloop2 {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		int k=1;
		for(int i=1;i<5;i++) //Outer For loop
		{
			//System.out.println("Outer loop Started");
			for(int j=1;j<=i;j++) //Inner For loop
			{
				System.out.print(k);
				System.out.print("\t"); //will leave space between the numbers
				k++;
				
			}
			System.out.println("");
		}
		
		/*Output
		
		1	
        2	3	
        4	5	6	
        7	8	9	10	*/

	}

}
