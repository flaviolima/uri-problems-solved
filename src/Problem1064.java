import java.util.Scanner;


public class Problem1064 {

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
		float nPositivos = 0;
		float ePos = 0;
		
		if(n1 > 0) {nPositivos++; ePos+=n1;}
		if(n2 > 0) {nPositivos++; ePos+=n2;}
		if(n3 > 0) {nPositivos++; ePos+=n3;}
		if(n4 > 0) {nPositivos++; ePos+=n4;}
		if(n5 > 0) {nPositivos++; ePos+=n5;}
		if(n6 > 0) {nPositivos++; ePos+=n6;}
		
		System.out.println((int)nPositivos + " valores positivos");
		System.out.printf("%.1f\n", ePos/nPositivos);

	}

}
