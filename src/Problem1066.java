import java.util.Scanner;


public class Problem1066 {

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
		int arrayN[] = {n1, n2, n3, n4, n5};
		int neg=0, pos=0, impar=0, par=0;
		for(int i = 0; i < arrayN.length; i++){
			if(arrayN[i]%2 == 0) {
				par++;
			}else{
				impar++;
			}
			
			if(arrayN[i] != 0){
				if(arrayN[i] > 0){
					pos++;	
				}else{
					neg++;
				}
			}
		}
		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(pos + " valor(es) positivo(s)");
		System.out.println(neg + " valor(es) negativo(s)");
	}

}
