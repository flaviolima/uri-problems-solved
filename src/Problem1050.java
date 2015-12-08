import java.util.Scanner;


public class Problem1050 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int ddd = scan.nextInt();
        switch (ddd) {
		case 61: //Brasilia
			System.out.println("Brasilia");
			break;
		case 71: //Salvador
			System.out.println("Salvador");
			break;
		case 11: //São Paulo
			System.out.println("Sao Paulo");
			break;
		case 21: //Rio de Janeiro
			System.out.println("Rio de Janeiro");
			break;
		case 32: //Juiz de Fora
			System.out.println("Juiz de Fora");
			break;
		case 19: //Campinas
			System.out.println("Campinas");
			break;
		case 27: //Vitória
			System.out.println("Vitoria");
			break;
		case 31: //Belo Horizonte
			System.out.println("Belo Horizonte");
			break;	
		default:
			System.out.println("DDD nao cadastrado");
			break;
		}
	}

}
