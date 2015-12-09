import java.util.Scanner;


public class Problem1067 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++){
			if(i%2 != 0){
				//Imprime o número impar
				System.out.println(i);	
			}
		}

	}

}
