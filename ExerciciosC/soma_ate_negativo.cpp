#include<conio.h>
#include<stdio.h>

main(){
	
	int numeros[10000], soma;
	
	for(int i = 0; i >= 0; i++){
		
		printf("Digite os numeros a serem somados = ");
		scanf("%d", &numeros[i]);
		
		soma += numeros[i];
		
		if(numeros[i] < 0){
			
			break;
			
		}
		
	}
	
	printf("A soma dos numeros digitados foi = %d", soma);
	
}
