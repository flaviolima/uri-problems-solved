import java.util.Scanner;


public class Problem1173 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();		
		int[] vetor = new int [10];
		vetor[0] = n;
		System.out.println("N[0] = " + vetor[0]);
		for(int i = 1; i < vetor.length; i++){
			n*=2;
			System.out.println("N["+ i + "]" + " = " + n);
		}
	}
}
