#include<conio.h>
#include<stdio.h>

main(){
	
	int idades_pessoas[19], total_idades;
	
	for(int i = 0; i <= 19; i++){
		
		printf("Digite as idades desejadas para soma = ");
		scanf("%d", &idades_pessoas[i]);
		total_idades += idades_pessoas[i];
		
	}
	
	printf("A soma de todas as idades = %d", total_idades);
	getch();
	
}
