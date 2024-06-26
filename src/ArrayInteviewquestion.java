
public class ArrayInteviewquestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Find the minimum number
		//2. Find the minimum number column
		//3. Find the maximum number in minimum number column
		
		 int abc[][] = {{4, 2, 5}, {10, 5, 7}, {1, 9, 2}};
	        int min = abc[0][0];
            int minicolumn = 0;
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (abc[i][j] < min) { //to print minimum number in the array >max
	                    min = abc[i][j]; //minimum number
	                    minicolumn=j;  //minimum number column
	                    System.out.println(minicolumn);
	                }
	            }
	        }
	        
           int max = abc[0][minicolumn];
           int k=0;
           while (k<3)
           {
        	   if(abc[k][minicolumn]>max) {
        		   max= abc[k][minicolumn]; //maximum number in minimum number column
        	   }
        	   k++;
           }
	        // Print the minimum value once, after finding it
	        System.out.println(max);

	}

}
