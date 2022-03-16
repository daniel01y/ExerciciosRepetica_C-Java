import java.util.Scanner;

public class SomaIdades20 {

	public static void main(String[] args) {
		
		int idades[] = new int[20], soma = 0;
		
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i <= 19; i++) {
			System.out.println("Digite a idade desejada = ");
			idades[i] = s.nextInt();
			soma += idades[i];
		}
		
		System.out.println(soma);
		
	}

}
