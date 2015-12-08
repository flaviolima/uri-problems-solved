import java.util.Scanner;


public class Problem1043 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float a = scan.nextFloat();
		float b = scan.nextFloat();
		float c = scan.nextFloat();
		
		if((a < (b+c)) && (b < (a+c)) && (c <(a+b))){
			System.out.printf("Perimetro = %.1f\n", a+b+c);
		}else{
			System.out.printf("Area = %.1f\n", (c*(a+b))/2);
		}

	}

}
