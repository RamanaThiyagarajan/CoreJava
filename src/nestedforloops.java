
public class nestedforloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Nested for loops
		
		int k=1;
		for(int i=0;i<4;i++) //Outer For loop
		{
			//System.out.println("Outer loop Started");
			for(int j=0;j<4-i;j++) //Inner For loop
			{
				System.out.print(k); //will print in the same line
				System.out.print("\t"); //will leave space between the numbers
				k++;
			}
			System.out.println("");
		}
		
		/*Output
		
		1	2	3	4	
		5	6	7	
		8	9	
		10	*/
		
		

	}

}
