import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Problem1002 {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
        
        InputStreamReader ir = new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(ir);
         
        double raio, area;
        double pi = 3.14159;
         
        raio = Double.parseDouble(in.readLine());
        area = pi * (raio*raio);
        
        System.out.printf("A=%.4f\n", area);
         
    }

}
