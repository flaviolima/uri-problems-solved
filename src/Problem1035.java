import java.util.Scanner;


public class Problem1035 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	      int a = scan.nextInt();
	      int b = scan.nextInt();
	      int c = scan.nextInt();
	      int d = scan.nextInt();
	      
	      if((b>c) && (d>a) && ((c+d)>(a+b)) && (a%2==0)){
	    	  System.out.println("Valores aceitos");
	      }else{
	    	  System.out.println("Valores nao aceitos"); 
	      }

	}

}
