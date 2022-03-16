#include<conio.h>
#include<stdio.h>

main(){
	
	int numeros[19], entre_cem, entre_duzentos, maiores_duzentos;
	
	for(int i = 0; i <= 19; i++){
		
		printf("Digite o numero desejado = ");
		scanf("%d", &numeros[i]);
		
		if(numeros[i] >= 0 && numeros[i] <= 100){
			
			entre_cem++;
			
		}else if(numeros[i] >= 101 && numeros[i] <= 200){
			
			entre_duzentos++;
			
		}else if(numeros[i] > 200){
			
			maiores_duzentos++;
			
		}
	}
	
	printf("\n%d numeros, estao entre 0 e 100.", entre_cem);
	printf("\n%d numeros, estao entre 101 e 200.", entre_duzentos);
	printf("\n%d numeros, sao maiores que 200.", maiores_duzentos);
	
	getch();
	
}
