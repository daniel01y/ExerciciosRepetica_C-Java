import java.util.Scanner;

public class MaioresQueOito {

	public static void main(String[] args) {
		
		int numeros[] = new int[20], maiorQueOito = 0;
		
		Scanner s = new Scanner(System.in);

		for(int i = 0; i <= 19; i++) {
			
			System.out.println("Digite o numero desejado = ");
			numeros[i] = s.nextInt();
			
			if(numeros[i] > 8) {
				maiorQueOito++;
			}
			
		}
		
		System.out.println(maiorQueOito + " numeros digitados são maiores que oito");
		
	}

}
