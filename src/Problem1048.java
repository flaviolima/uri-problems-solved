import java.util.Scanner;


public class Problem1048 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		float salario = scan.nextFloat();
		float novoSalario = 0, reajuste = 0; 
		float percentual = 0;
		
		if(salario <= 400){ 
			percentual = 15;
			reajuste = salario * (percentual/100);
			novoSalario = salario + reajuste;
		}
		
		if (salario > 400 && salario <= 800){
			percentual = 12;
			reajuste = salario * (percentual/100);
			novoSalario = salario + reajuste;	
		}
		
		if (salario > 800 && salario <= 1200){
			percentual = 10;
			reajuste = salario * (percentual/100);
			novoSalario = salario + reajuste;
		}
		
		if (salario > 1200 && salario <= 2000){
			percentual = 7;
			reajuste = salario * (percentual/100);
			novoSalario = salario + reajuste;	
		}
		
		if (salario > 2000){
			percentual = 4;
			reajuste = salario * (percentual/100);
			novoSalario = salario + reajuste;
		}
		
		System.out.printf("Novo salario: %.2f\n", novoSalario);
		System.out.printf("Reajuste ganho: %.2f\n", reajuste);
		System.out.println("Em percentual: " + (int)(percentual) + " %");

	}
	
}
