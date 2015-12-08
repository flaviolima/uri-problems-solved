import java.util.Scanner;


public class Problem1078 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1; i < 11; i++){
			System.out.println(i + " x " + n + " = " + i*n);
		}

	}

}
