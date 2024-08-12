
public class javaInterviewQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int s[] = { 10, 2, 3, 4, 5, 6 };

		int min = s[0];
		for (int i = 0; i < s.length; i++) {
			if (s[i] < min) {
				min = s[i];
			}
		}
		System.out.println(min);
	}

}
