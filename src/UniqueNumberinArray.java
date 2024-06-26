import java.util.ArrayList;

public class UniqueNumberinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 2, 2, 3, 2, 4, 5, 6, 4, 5, 10, 7, 7 };

//		 for (int i = 0; i < array.length; i++) {
//	            boolean isUnique = true;
//	            
//	            // Check if array[i] is unique
//	            for (int j = 0; j < array.length; j++) {
//	                if (i != j && array[i] == array[j]) {
//	                    isUnique = false;
//	                    break;
//	                }
//	            }
//	            
//	            // If it is unique, print it
//	            if (isUnique) {
//	                System.out.println(array[i]);
//	            }
//	        }

		ArrayList<Integer> ab = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {

			int k = 0;
			if (!ab.contains(a[i]))

			{
				ab.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++)

				{
					if (a[i] == a[j]) {
						k++;
					}
				}
			}

			if (k == 1)
				System.out.println(a[i] + "is unique number");
		}

	}

}
