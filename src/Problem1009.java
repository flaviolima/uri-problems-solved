import java.util.Scanner;


public class Problem1009 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String nome = scan.next();
		double salarioFixo = scan.nextDouble();
		double totalVendas = scan.nextDouble();
		double salarioMensal = salarioFixo + (totalVendas*0.15);
		System.out.printf("TOTAL = R$ %.2f\n",salarioMensal);
	}

}
