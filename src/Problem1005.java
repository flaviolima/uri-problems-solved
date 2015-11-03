import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1005 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
        
			InputStreamReader ir = new InputStreamReader(System.in);
	        BufferedReader in = new BufferedReader(ir);
	         
	        double a, b, c, media;
	        a = Double.parseDouble(in.readLine());
	        b = Double.parseDouble(in.readLine());
	        
	        a = a*3.5/11;
	        b = b*7.5/11;
	        media = a + b;
	        
	        System.out.printf("MEDIA = %.5f\n", media);
         
    }

}
