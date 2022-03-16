import java.util.Scanner;

public class NomeNVezes {

	public static void main(String[] args) {
		
		int numero;
		String nome;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Digite seu nome");
		nome = s.nextLine();
		System.out.println("Digite o numero de vezes que queira repetir seu nome = ");
		numero = s.nextInt();
		
		for(int i = 1; i <= numero; i++) {
			System.out.println(nome);
		}
		
	}

}
