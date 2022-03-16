import java.util.ArrayList;
import java.util.Scanner;

public class SomaNumerosDigitados {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		boolean booleana = true;
		int pegaNumero = 0, soma = 0;
		
		ArrayList<String> numeros = new ArrayList<>();
		
		for(int i = 0; booleana; i++) {
			
			System.out.println("Digite o número para soma = ");
			numeros.add(s.next());
			soma += Integer.parseInt(numeros.get(i));
			pegaNumero = Integer.parseInt(numeros.get(i));
			
			if(pegaNumero < 0) {
				
				break;
				
			}
			
		}
		
			System.out.println("A soma dos numeros digitados = " + soma);

	}

}
