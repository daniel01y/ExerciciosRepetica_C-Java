import java.util.Scanner;

public class NomeUsuario {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.println("Digite seu nome = ");
		String nome = s.nextLine();
		
		for(int i = 1; i <= 10; i++) {
		System.out.println(nome);
		}
	}

}
