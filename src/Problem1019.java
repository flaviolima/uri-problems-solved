import java.util.Scanner;


public class Problem1019 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int h=0, m=0, s=0;
		int resto=0;
		h = n/3600;
		resto = n%3600;
		m = resto/60;
		s = (resto%60);
		System.out.printf("%d:%d:%d\n", h, m, s);
	}

}
