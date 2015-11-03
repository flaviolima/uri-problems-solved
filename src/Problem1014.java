import java.util.Scanner;


public class Problem1014 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		double y = scan.nextDouble();
		double consumo = x/y;
		
		System.out.printf("%.3f km/l\n", consumo);
	}

}
