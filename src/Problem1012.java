import java.util.Scanner;


public class Problem1012 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double a = scan.nextDouble();
		double b = scan.nextDouble();
		double c = scan.nextDouble();
		double pi = 3.14159;
		
		double areaTrianguloRetangulo = (a*c)/2;
		double areaCirculo = pi*Math.pow(c, 2);
		double areaTrapezio = c*(a+b)/2;
		double areaQuadrado = b*b;
		double areaRetangulo = a*b;
		
		
		System.out.printf("TRIANGULO: %.3f\n", areaTrianguloRetangulo);
		System.out.printf("CIRCULO: %.3f\n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
		System.out.printf("RETANGULO: %.3f\n", areaRetangulo);

	}

}
