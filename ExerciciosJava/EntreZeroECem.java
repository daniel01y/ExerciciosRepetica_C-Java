import java.util.Scanner;

public class EntreZeroECem {

	public static void main(String[] args) {
		
		int numeros[] = new int[20], entreZeroECem = 0;
		
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i <= 19; i++) {
			
			System.out.println("Digite o numero desejado = ");
			numeros[i] = s.nextInt();
			
			if(numeros[i] > 0 && numeros[i] < 100) {
				
				entreZeroECem++;
				
			}
			
		}
		
		System.out.println(entreZeroECem + " numeros estão entre zero e cem");

	}

}
