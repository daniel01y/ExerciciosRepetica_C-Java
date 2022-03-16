import java.util.Scanner;

public class IdadeMaiores {

	public static void main(String[] args) {
		
		int idades[] = new int[20], maioresIdade = 0;
		
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i <= 19; i++) {
			System.out.println("Digite a idade desejada = ");
			idades[i] = s.nextInt();
			if(idades[i] >= 18) {
				maioresIdade++;
			}
		}
		System.out.println(maioresIdade + " São maiores de idade!");
		
	}

}
