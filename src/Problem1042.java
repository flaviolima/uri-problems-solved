import java.util.Scanner;


public class Problem1042 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	      int number1 = scan.nextInt();
	      int number2 = scan.nextInt();
	      int number3 = scan.nextInt();
	      
	      int n1 = number1;
	      int n2 = number2;
	      int n3 = number3;
	      
	      if (number1 > number2) {
	          int temp = number1;
	          number1 = number2;
	          number2 = temp; 
	        }

	        if (number2 > number3) {
	          int temp = number2;
	          number2 = number3;
	          number3 = temp;
	        }

	        if (number1 > number2) {
	          int temp = number1;
	          number1 = number2;
	          number2 = temp;
	        }

	        System.out.println(number1);
	        System.out.println(number2);
	        System.out.println(number3);
	        System.out.println("");
	        System.out.println(n1);
	        System.out.println(n2);
	        System.out.println(n3);
	      
	}

}
