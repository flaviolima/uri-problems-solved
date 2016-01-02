import java.util.Scanner;


public class Problem1157 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		
		for(int i = 1; i <= n; i++){
			if(n % i == 0){
				System.out.println(i);
			}
		}
	}

}
