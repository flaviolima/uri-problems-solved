import java.util.Scanner;


public class Problem1154 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int idade = 0, qtd = 0;
		double media = 0, soma = 0;
		do{
			idade = scan.nextInt();
			if(idade > 0){
				soma += idade;
				qtd++;
			}
		}while(idade > 0);
		
		media = soma/qtd;
		System.out.printf("%.2f\n", media);
	}
}
	