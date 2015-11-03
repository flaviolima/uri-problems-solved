import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1006 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
        
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
         
        double a, b, c, media;
        a = Double.parseDouble(in.readLine());
        b = Double.parseDouble(in.readLine());
        c = Double.parseDouble(in.readLine());
        
        a = a*2/10;
        b = b*3/10;
        c = c*5/10;
        media = a + b + c;
        
        System.out.printf("MEDIA = %.1f\n", media);
         
    }

}
