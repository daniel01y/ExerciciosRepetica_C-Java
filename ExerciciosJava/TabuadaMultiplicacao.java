import java.util.Scanner;

public class TabuadaMultiplicacao {

	public static void main(String[] args) {
		
		int numero = 0;
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite o numero que deseja ver a tabuada = ");
		numero = s.nextInt();

		for(int i = 1; i <= 10; i++) {
			
			System.out.println(numero + " * " + i + " = " + numero * i);
			
		}
		
	}

}
