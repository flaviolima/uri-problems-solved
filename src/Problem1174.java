import java.util.Scanner;


public class Problem1174 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double[] vetor = new double[100];
		double x = 0;
		for(int i = 0; i < vetor.length; i++){
			x = scan.nextDouble();
			vetor[i] = x;
		}
		
		for(int i = 0; i < vetor.length; i++){
			if(vetor[i] <= 10){
				System.out.printf("A[" + i + "] = " + "%.1f\n", vetor[i]);
			}
		}

	}

}
