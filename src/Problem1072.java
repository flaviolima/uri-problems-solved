import java.util.Scanner;


public class Problem1072 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int in = 0;
		int out = 0;
		for(int i = 0; i < n; i++){
			int n1 = scan.nextInt();
			if(n1 >= 10 && n1 <=20){
				in++;
			}else{
				out++;
			}
		}
		System.out.println(in + " in");
		System.out.println(out + " out");

	}

}
