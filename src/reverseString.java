
public class reverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String inputString = "RahulShettyAcdemy";
		String outputString = "";

		for (int i = inputString.length() - 1; i >= 0; i--) {
			outputString = outputString + inputString.charAt(i);
		}

		System.out.println(outputString);

		// Another method to Achieve reverse string
		StringBuilder sb = new StringBuilder(inputString);
		String reversed = sb.reverse().toString();

		// Printing the reversed string
		System.out.println(reversed);
	}

}
