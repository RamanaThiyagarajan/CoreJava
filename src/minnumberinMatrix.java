
public class minnumberinMatrix {

    public static void main(String[] args) {
        // Corrected array initialization syntax
    	//to print minimum number in the Array
        int abc[][] = {{2, 4, 5}, {3, 5, 7}, {1, 9, 2}};
        int max = abc[0][0];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (abc[i][j] > max) { //to print maximum number in the array >max
                    max = abc[i][j];
                }
            }
        }

        // Print the minimum value once, after finding it
        System.out.println("Maximum value in the matrix: " + max);
        
//        int abc[][] = {{2, 4, 5}, {3, 5, 7}, {1, 9, 2}};
//        int min = abc[0][0];
//
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 3; j++) {
//                if (abc[i][j] < min) { //to print maximum number in the array >max
//                    min = abc[i][j];
//                }
//            }
//        }
//
//        // Print the minimum value once, after finding it
//        System.out.println("Minimum value in the matrix: " + min);
    }
}
