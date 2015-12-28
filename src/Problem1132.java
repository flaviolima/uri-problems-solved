import java.util.Scanner;


public class Problem1132 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int soma = 0;
		if(x < y){
			for (int i = x; i <= y; i++){
				if(i%13 != 0){
					soma += i;	
				}
			}
		}else{
			for (int i = y; i <= x; i++){
				if(i%13 != 0){
					soma += i;	
				}
			}
		}
		System.out.println(soma);
	}

}
