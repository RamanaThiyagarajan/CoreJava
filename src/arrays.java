import java.util.ArrayList;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = new int[5];
		a[0] = 1;
		a[1] = 2;
		a[2] = 3;
		a[3] = 4;
		a[4] = 5;

		int b[] = { 2, 4, 6, 8, 10 };

		for (int i = 0; i < 5; i++) {
			System.out.println(b[i]);
		}

		int array[] = { 2, 2, 3, 2, 4, 4 };

		ArrayList<Integer> ab = new ArrayList<Integer>();

		for (int i = 0; i < array.length; i++) {
			int k = 0;
			if (!ab.contains(array[i])) {

				ab.add(array[i]);
				k++;

				for (int j = i + 1; j < array.length; j++) {

					if (array[i] == array[j]) {
						k++;
					}
				}

			}
			if (k == 1) {
				System.out.println(array[i] + " is a unique number");

			}

		}

	}
}
