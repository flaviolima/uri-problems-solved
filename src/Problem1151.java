import java.util.Scanner;


public class Problem1151 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int n0 = 0, n1 = 1;
		if(n < 46){
			System.out.print(n0 + " " + n1);
			for(int i = 0; i < n-2; i++){
				n1 = n1 + n0;
				n0 = n1 - n0;
				System.out.print(" " + n1);
			}
			
			System.out.print("\n");
		}
	}

}
