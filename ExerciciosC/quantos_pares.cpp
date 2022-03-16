#include<conio.h>
#include<stdio.h>

main(){
	
	int numeros[19], numeros_pares;
	
	for(int i = 0; i <= 19; i++){
		
		printf("Digite o numero desejado = ");
		scanf("%d", &numeros[i]);
		
		if(numeros[i] % 2 == 0){
			numeros_pares++;
		}
		
	}
	
	printf("%d numeros digitados, sao pares.", numeros_pares);
	
}
