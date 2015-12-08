import java.util.Scanner;


public class Problem1020 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		    Scanner scan = new Scanner(System.in);
	        int idade = scan.nextInt();
	        int anos = idade / 365; 
	        int meses = (idade % 365) / 30;
	        int dias =(idade % 365) % 30;
	        System.out.printf("%d ano(s)\n",anos);
	        System.out.printf("%d mes(es)\n",meses);
	        System.out.printf("%d dia(s)\n",dias);
	}

}
