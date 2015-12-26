import java.util.Scanner;


public class Problem1046 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inicio = scan.nextInt();
		int fim = scan.nextInt();
		int duracao = 0;
		
		if(inicio > fim){
			duracao = (24-inicio)+fim;
		}else if(inicio == fim){
			duracao = 24;
		}
		else{
			duracao = fim-inicio;
		}
		System.out.println("O JOGO DUROU "+ duracao + " HORA(S)");
	}

}
