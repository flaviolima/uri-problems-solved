import java.util.Scanner;


public class Problem1134 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = 0, al = 0, gas = 0, die = 0;
		do {
			n = scan.nextInt();
				switch (n) {
				case 1:
					al ++;
					break;
				case 2:
					gas ++;
					break;
				case 3:
					die ++;
				break;
			   
				default:
				 break;
			}
		}while(n != 4);
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + al);
		System.out.println("Gasolina: " + gas);
		System.out.println("Diesel: " +  die);
	}

}
