import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1004 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
        
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
         
        int a, b, c;
        a = Integer.parseInt(in.readLine());
        b = Integer.parseInt(in.readLine());
        c = a*b;
        
        System.out.printf("PROD = %d\n", c);
         
    }

}