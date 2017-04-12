/*
Autor:jose Antonio Barrera Morales 21/febreo/17
Entradas: n(entero),x(flotante)
Salidas: coseno (float)
Procedimiento general:es toma el n y en un ciclo for que avanza de uno en uno hasta n empieza la operacion
almacenando los resultados en la variable resultado. la variable signo va alternando valores entre 1 y -1 para cambiar entre suma y resta en la operacion
se una una funcion potencia para sacar la pontencia de x y el contador multiplicado por 2,esto se divide entre el factorial, calculado con funciondel contador por 2

*/

#include <stdio.h>
int factorial(int numero);
float potencia(float base,int potencia);
int main(int argc, char *argv[]) {
	int n,contador,signo=1;
	float x,resultado=1;
	printf("inserta x");
	scanf("%f",&x);
	printf("inserta n");
	scanf("%d",&n);
	for(contador=1;contador<=n;contador++)
	{
		signo=signo*(-1);
		resultado= resultado+ signo*(potencia(x,contador*2)/factorial(contador*2));
	}
	printf("%f",resultado);
	return 0;
}
int factorial(int numero){
	int i,resultado=1;
	for(i=1;i<=numero;i++){
		resultado=resultado*i;
	}
	return resultado;
}
float potencia(float base,int exponente){
	float resultado=1;
	int i;
	for(i=1;i<=exponente;i++){
		resultado=resultado*base;
	}
	return resultado;
}
