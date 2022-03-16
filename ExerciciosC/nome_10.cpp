#include<conio.h>
#include<stdio.h>

main(){
	
	char nome[100];
	
	printf("Digite seu nome = ");
	scanf("%s", &nome);
	
	for(int i = 0; i <= 10; i++){
		printf("\n%s", nome);
	}
	
}
