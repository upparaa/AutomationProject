package Automation;

public class Simplejavaprogram {
	


	public static void main(String[] args) {
		
		 int num1 = 10;
	        int num2 = 0;  // This will cause a division by zero error
	        try {
	            int result = divide(num1, num2);  // Step Into this method
	            System.out.println("Result = " + result);
	        } catch (ArithmeticException e) {
	            System.out.println("Exception caught: " + e.getMessage());
	        }
	    }

	    public static int divide(int a, int b) {
	        return a / b;  // Error occurs here
	    }
	}
		


