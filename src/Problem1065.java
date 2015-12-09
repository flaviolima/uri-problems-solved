import java.util.Scanner;


public class Problem1065 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();
		int n4 = scan.nextInt();
		int n5 = scan.nextInt();
		int nPar = 0;
		
		if(n1%2 == 0) {nPar++;}
		if(n2%2 == 0) {nPar++;}
		if(n3%2 == 0) {nPar++;}
		if(n4%2 == 0) {nPar++;}
		if(n5%2 == 0) {nPar++;}
		
		System.out.println(nPar + " valores pares");

	}

}
