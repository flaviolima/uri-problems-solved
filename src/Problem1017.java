import java.util.Scanner;


public class Problem1017 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int tempo = scan.nextInt();
		int velocidade = scan.nextInt();
		double qtdCombustivel = (((velocidade/tempo)/12)*100);
		System.out.printf("%.3f\n", qtdCombustivel);

	}

}
