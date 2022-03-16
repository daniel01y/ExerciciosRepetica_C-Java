#include<conio.h>
#include<stdio.h>

main(){
	
	int numero;
	
	printf("Digite o numero para realizar a tabuada = ");
	scanf("%d", &numero);
	
	for(int i = 1; i <= 10; i++){
		
		printf("\n%d x %d = %d", numero, i, numero * i);
		
	}
	
}
