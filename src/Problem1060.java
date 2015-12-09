import java.util.Scanner;


public class Problem1060 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float n1 = scan.nextFloat();
		float n2 = scan.nextFloat();
		float n3 = scan.nextFloat();
		float n4 = scan.nextFloat();
		float n5 = scan.nextFloat();
		float n6 = scan.nextFloat();
		int nPositivos = 0;
		
		if(n1 > 0) {nPositivos++;}
		if(n2 > 0) {nPositivos++;}
		if(n3 > 0) {nPositivos++;}
		if(n4 > 0) {nPositivos++;}
		if(n5 > 0) {nPositivos++;}
		if(n6 > 0) {nPositivos++;}
		
		System.out.println(nPositivos + " valores positivos");

	}

}
