/*
Autor:Moisés Vinajera 21/Febrero/17
Entradas: numero
Salidas: numero en binario(variable numero)
Procedimiento general:
toma la entrada a del usuario, al dividirlo entre 2 toma el residuo y lo multiplica por 2 a la potencia del contador
#esto para ir aumentando en base 2. reduce el numero dividiendolo entre 10 y aumenta el contador.Esto se repite muentras el numero sea igual o mayor a uno.

*/

#include <stdio.h>
int EnteroABinario(int x);
int main(int argc, char *argv[]) {
	int numero;
	scanf("%d",&numero);
	numero=EnteroABinario(numero);
	printf("%d",numero);
	return 0;
}
int EnteroABinario(int x){
	int binario=0,i=1;
	while(x!=0){
		binario= binario + ((x%2)*i);
		x=x/2;
		i=i*10;
	}
	return binario;
}
