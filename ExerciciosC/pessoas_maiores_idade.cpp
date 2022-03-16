#include<conio.h>
#include<stdio.h>

main(){
	
	int idades_pessoas[19], pessoasMaioresIdade;
	
	for(int i = 0; i <= 19; i++){
		
		printf("Digite as idades desejadas = ");
		scanf("%d", &idades_pessoas[i]);
		if(idades_pessoas[i] >= 18){
			pessoasMaioresIdade++;
		}
		
	}
	
	printf("Quantidade de pessoas maiores de idade = %d", pessoasMaioresIdade);
	getch();
	
}
