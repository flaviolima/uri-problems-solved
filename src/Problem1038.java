import java.util.Scanner;


public class Problem1038 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int item = scan.nextInt();
        int qtd = scan.nextInt();
        double total = 0;
        switch (item) {
		case 1: //Cachorro Quente: R$4.00
			total = qtd * 4;
			break;
		case 2: //X-Salada: R$4.50
			total = qtd * 4.5;
			break;
		case 3: //X-Bacon: R$5.00
			total = qtd * 5;
			break;
		case 4: //Torrada Simples: R$2.00
			total = qtd * 2;
			break;
		case 5: //Refrigerante: R$1.50
			total = qtd * 1.5;
			break;
		default:
			break;
		}
        
        System.out.printf("Total: R$ %.2f\n", total);

	}

}
