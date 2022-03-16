import java.util.Scanner;

public class IdadeMaisNova {

	public static void main(String[] args) {
			
		String nomes[] = new String[10], nomeMaisNovo = "";
		int idades[] = new int[10], idadeMaisNova = 999;
		
		Scanner s = new Scanner(System.in);
		
		for(int i = 0; i <= 9; i++) {
			
			System.out.println("Digite o nome desejado = ");
			nomes[i] = s.next();
			
			System.out.println("Digite a idade desejada = ");
			idades[i] = s.nextInt();
			
		}
		
		for(int i = 0; i <= 9; i++) {
			if(idades[i] < idadeMaisNova) {
				idadeMaisNova = idades[i];
				nomeMaisNovo = nomes[i];
			}
		}
		
		System.out.println("A pessoa mais nova é = " + nomeMaisNovo + " com " + idadeMaisNova + " anos");
		
	}
	
}
