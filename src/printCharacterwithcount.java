
public class printCharacterwithcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "java";
		int[] charCount = new int[256];

		s.toLowerCase();

		for (char c : s.toCharArray()) {
			charCount[c]++;
		}

		for (int i = 0; i < charCount.length; i++) {
			if (charCount[i] > 0) {
				System.out.println((char) i + ":" + charCount[i]);
			}

		}

	}

}
