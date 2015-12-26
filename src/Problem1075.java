import java.util.Scanner;


public class Problem1075 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		if(n < 10000){
			for(int i = 1; i < 10000; i++){
				if(i%n == 2){
					System.out.println(i);
				}
			}
		}
	}

}
