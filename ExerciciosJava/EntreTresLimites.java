import java.util.Scanner;

public class EntreTresLimites {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		
		int numeros[] = new int[20], entreCem = 0, entreDuzentos = 0 , maiorDuzentos = 0;

		for(int i = 0; i <= 19; i++) {
			
			System.out.println("Digite o n�mero desejado = ");
			numeros[i] = s.nextInt();
			
			if(numeros[i] >= 0 && numeros[i] <= 100) {
				
				entreCem++;
				
			}else if(numeros[i] >= 101 && numeros[i] <= 200) {
				
				entreDuzentos++;
				
			}else if(numeros[i] > 200) {
				
				maiorDuzentos++;
				
			}
			
		}
		
			System.out.println(entreCem + " numeros est�o entre 0 e 100!");
			System.out.println(entreDuzentos + " numeros est�o entre 101 e 200!");
			System.out.println(maiorDuzentos + " numeros s�o maiores que 200!");
			
	}

}
