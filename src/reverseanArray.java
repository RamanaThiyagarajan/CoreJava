
public class reverseanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char s[]= {'a', 'b', 'c', 'd'};
		
		int left=0;
		int right = s.length-1;
		
		while(left<right) {
			
			char c = s[left];
			s[left]= s[right];
		    s[right]= c;
		    
		    left +=1;
		    right -=1;
		}
		
       for(int i=0; i<s.length; i++) {
    	   
    	   System.out.println(s[i]+"");
       }
    		   }

}
