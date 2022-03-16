#include<conio.h>
#include<stdio.h>

main(){
	
	int numeros[19], entre_cem;
	
	for(int i = 0; i <= 19; i++){
		
		printf("Digite o numero desejado = ");
		scanf("%d", &numeros[i]);
		
		if(numeros[i] >= 0 && numeros[i] <= 100){
			
			entre_cem++;
			
		}
	}
	
	printf("%d numeros, estao entre 0 e 100.", entre_cem);
	
}
