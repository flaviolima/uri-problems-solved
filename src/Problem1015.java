import java.util.Scanner;


public class Problem1015 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double x1 = scan.nextDouble();
		double x2 = scan.nextDouble();
		double y1 = scan.nextDouble();
		double y2 = scan.nextDouble();
		double x = Math.pow(x2-x1,2);
		double y = Math.pow(y2-y1,2);	
		double distancia = Math.sqrt(x+y);
		
		System.out.printf("%.4f\n", distancia);
	}

}
