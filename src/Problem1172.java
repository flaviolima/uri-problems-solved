import java.util.Scanner;


public class Problem1172 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] vetor = new int[10];
		int x = 0;
		for(int i = 0; i < vetor.length; i++){
			x = scan.nextInt();
			if(x <= 0){
				vetor[i] = 1;
			}else{
				vetor[i] = x;
			}
		}
		
		for(int i = 0; i < vetor.length; i++){
			System.out.println("X[" + i + "] = " + vetor[i]);
		}
	}
}
