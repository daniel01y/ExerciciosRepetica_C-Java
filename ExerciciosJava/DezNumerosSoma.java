import java.util.Scanner;

public class DezNumerosSoma {

	public static void main(String[] args) {
		
		int numeros[] = new int[10], soma = 0;
		
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i <= 9; i++) {
			
			System.out.println("Digite o numero a ser somado = ");
			numeros[i] = s.nextInt();
			soma += numeros[i];
			
		}
		
		System.out.println(soma);

	}

}
