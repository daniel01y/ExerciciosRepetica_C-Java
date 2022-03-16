#include<conio.h>
#include<stdio.h>

main(){
	
	int numeros[19], maiores_oito;
	
	for(int i = 0; i <= 19; i++){
		
		printf("Digite o numero desejado = ");
		scanf("%d", &numeros[i]);
		
		if(numeros[i] > 8){
			maiores_oito++;
		}
		
	}
	
	printf("%d numeros digitados, sao maiores que oito.", maiores_oito);
	
}
