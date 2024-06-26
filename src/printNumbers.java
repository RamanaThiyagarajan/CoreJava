
public class printNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printnum(1);

	}
	
	public static void printnum(int num) {
		
		if(num<=100) {
			System.out.println(num);
			num++;
			printnum(num);
		}
		
	}

}
