import java.io.IOException;
import java.util.Scanner;

public class Problem1008 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
        
		Scanner scan = new Scanner(System.in);
        
		int numFunc, nrHr;
        double vlHr, salFunc;
      
        numFunc = scan.nextInt();
        nrHr = scan.nextInt();
        vlHr = scan.nextDouble();
        
        salFunc = nrHr * vlHr;
  
        System.out.printf("NUMBER = %d\n", numFunc);
        System.out.printf("SALARY = U$ %.2f\n",salFunc);
         
    }

}
