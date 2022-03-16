import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		
		int numeros[] = new int[20], quantosPares = 0;
		
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i <= 19; i++) {
			System.out.println("Digite o numero desejado = ");
			numeros[i] = s.nextInt();
			
			if(numeros[i] % 2 == 0) {
				quantosPares++;
			}
		}

			System.out.println(quantosPares + " numeros são pares.");
		
	}

}
