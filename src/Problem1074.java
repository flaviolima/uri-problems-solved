import java.util.Scanner;


public class Problem1074 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for(int i = 0; i < n; i++){
			int n1 = scan.nextInt();
			if(n1 == 0){
			  System.out.println("NULL");	
			}
			if(n1%2 == 0 && n1 > 0) {
				System.out.println("EVEN POSITIVE");
			}
			if((n1%2 == 0 && n1 < 0)){
				System.out.println("EVEN NEGATIVE");
			}
			if((n1%2 != 0 && n1 > 0)){
				System.out.println("ODD POSITIVE");
			}
			if((n1%2 != 0 && n1 < 0)){
				System.out.println("ODD NEGATIVE");
			}
		}
	}
}
