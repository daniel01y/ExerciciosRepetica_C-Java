#include<conio.h>
#include<stdio.h>
			
			
main(){
		char nomes[9], nomeMaisNovo;
		int idades[9], idadeMaisNova = 999;
		
		for(int i = 0; i <= 9; i++) {
			
			printf("Digite o nome desejado = ");
			scanf("%s", &nomes[i]);
			
			printf("Digite a idade desejada = ");
			scanf("%d", &idades[i]);
			
		}
		
		for(int i = 0; i <= 9; i++) {
			if(idades[i] < idadeMaisNova) {
				idadeMaisNova = idades[i];
				nomeMaisNovo = nomes[i];
			}
		}
				
		printf("A pessoa mais nova e %s, com %d anos!", nomeMaisNovo, idadeMaisNova);
		
	}
