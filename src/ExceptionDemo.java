
public class ExceptionDemo {
	// one try can be followed by mutiplle catch blocks
	// catch should be an immediate block after try

	/* Exceptions in Java are events that disrupt the normal flow of the program's
	 instructions. When an error occurs within a method, the method creates an
	 object (exception object) and hands it off to the runtime system. The
	 exception object contains information about the error, including its type and
	 the state of the program when the error occurred. Creating an exception
	 object and handing it to the runtime system is called "throwing an
	 exception." */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int b = 7;
		int c = 0;

		try {
			// purchased faile
			int k = b / c;
			int arr[] = new int[5];
			System.out.println(arr[7]);

		} catch (ArithmeticException et) {
			System.out.println("I catched the Arthimetic/exception");
		} catch (IndexOutOfBoundsException ets) {
			System.out.println("I catched the IndexBound/exception");
		} catch (Exception e) {
			// retry again
			System.out.println("I catched the error/exception");
		} finally {
			System.out.println("delete cookies");// THis block is executed irrespective of exception thrown or not
		}

		/*
		  In Java, the finally block is used to execute a code segment that must run
		  regardless of whether an exception is thrown or not. It is commonly used for
		  cleanup activities, such as releasing resources like closing files, closing
		  database connections, or cleaning up memory. The finally block is always
		  executed after the try block and any catch blocks, if present.
		 */
	}

}
