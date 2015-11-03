import java.util.Scanner;


public class Problem1011 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int raio = scan.nextInt();
		double pi = 3.14159;
		double volume = (4/3.0) * pi * Math.pow(raio, 3);
		
		System.out.printf("VOLUME = %.3f\n", volume);
	}

}
