import java.util.Scanner;


public class Problem1070 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();

		for(int i = n; i <= n+12; i++){
			if(i%2 != 0){
				//Imprime o número impar
				System.out.println(i);	
			}
		}

	}

}
