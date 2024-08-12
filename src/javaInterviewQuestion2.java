
public class javaInterviewQuestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sb[][] = {{1,2,3},{ 4,5,6}};
		int minimum =sb[0][0];
		for(int i = 0;i<2;i++)
		{
			for (int j=0; j<3; j++) {
				if(sb[i][j]<minimum) {
					minimum= sb[i][j];
				}
			}
			
		}
		System.out.println(minimum);
	}

	}


