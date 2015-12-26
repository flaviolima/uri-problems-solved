import java.util.Scanner;


public class Problem1049 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String p1 = scan.next();
		String p2 = scan.next();
		String p3 = scan.next();
	    
		if(p1.equals("vertebrado")){
			if(p2.equals("ave")){
				if(p3.equals("carnivoro")){
					System.out.println("aguia");
				}else{
					System.out.println("pomba");
				}
			}else{
				if(p3.equals("onivoro")){
					System.out.println("homem");
				}else{
					System.out.println("vaca");
				}
			}
			
		}else{
			if(p2.equals("inseto")){
				if(p3.equals("hematofago")){
					System.out.println("pulga");
				}else{
					System.out.println("lagarta");
				}
			}else{
				if(p3.equals("hematofago")){
					System.out.println("sanguessuga");
				}else{
					System.out.println("minhoca");
				}
			}
		}
	}

}
