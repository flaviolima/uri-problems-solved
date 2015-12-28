import java.util.Scanner;


public class Problem1114 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int senha = 0, j = 0;
		do{
			senha = scan.nextInt();
			j++;
		}while(senha != 2002);
		
		for (int i = 0; i < j-1; i++){
		    System.out.println("Senha Invalida");
		}
        
		System.out.println("Acesso Permitido");
	}

}
