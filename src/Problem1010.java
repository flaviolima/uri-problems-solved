import java.util.Scanner;


public class Problem1010 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	
		int codPeca1 = scan.nextInt();
		int numPeca1 = scan.nextInt();
		double valUnitPeca1 = scan.nextDouble();
		
		int codPeca2 = scan.nextInt();
		int numPeca2= scan.nextInt();
		double valUnitPeca2 = scan.nextDouble();
		
		double totalPecas = (numPeca1 * valUnitPeca1) + (numPeca2 * valUnitPeca2);

		System.out.printf("VALOR A PAGAR: R$ %.2f\n", totalPecas);

	}

}
