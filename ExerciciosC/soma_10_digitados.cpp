#include<conio.h>
#include<stdio.h>

main(){
	
	int numeros[9], total_soma;
	
	for(int i = 0; i <= 9; i++){
		
		printf("Digite os numeros desejados para soma = ");
		scanf("%d", &numeros[i]);
		total_soma += numeros[i];
		
	}
	printf("A soma de todos os numeros digitados = %d", total_soma);
	
	getch();
}
