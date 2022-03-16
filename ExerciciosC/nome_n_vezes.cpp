#include<conio.h>
#include<stdio.h>

main(){
	
	char nome[30];
	int numero = 0;
	
	printf("Digite um nome = ");
	scanf("%s", &nome);
	
	printf("\nDigite o numero de vezes que deseja repiti-lo = ");
	scanf("%d", &numero);
	
	for(int i = 1; i <= numero; i++){
		printf("\n%s", nome);
	}
	
}
