import java.util.Scanner;


public class Problem1018 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int nota100 = 0;
		int nota50 = 0;
		int nota20 = 0;
		int nota10 = 0;
		int nota5 = 0;
		int nota2 = 0;
		int nota1 = 0;
		int resto = 0;
		
		nota100 = n/100;
		resto = n%100;
		
		nota50 = resto/50;
		resto = resto%50;
		
		nota20 = resto/20;
		resto = resto%20;
		
		nota10 = resto/10;
		resto = resto%10;
		
		nota5 = resto/5;
		resto = resto%5;
		
		nota2 = resto/2;
		resto = resto%2;
		
		nota1 = resto/1;
		resto = resto%1;
		
		System.out.printf("%d\n", n);
		System.out.printf("%d nota(s) de R$ 100,00\n", nota100);
		System.out.printf("%d nota(s) de R$ 50,00\n", nota50);
		System.out.printf("%d nota(s) de R$ 20,00\n", nota20);
		System.out.printf("%d nota(s) de R$ 10,00\n", nota10);
		System.out.printf("%d nota(s) de R$ 5,00\n", nota5);
		System.out.printf("%d nota(s) de R$ 2,00\n", nota2);
		System.out.printf("%d nota(s) de R$ 1,00\n", nota1);

	}

}
