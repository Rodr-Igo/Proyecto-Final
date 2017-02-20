#include <stdio.h>

float potencia (float, int);
int factorial (int);

int main(int argc, char const *argv[]) {
	int n, contador = 0, signo = 1;
	float x, coseno = 1;

	printf("Ingrese el angulo, seguido de el numero de terminos que calcula\n");
	scanf("%d %f",&n, &x);

	for (contador = 1; contador <= n; contador++)
	{
		signo = signo * (-1);
		coseno = coseno + signo*(potencia(x, contador * 2)/factorial(contador * 2));
	}

	printf("Este es el coseno: %f", coseno);


	return 0;
}

float potencia(float base, int exponente){

	int contador;
	float potencia = 1;
	for (contador = 1; contador <= exponente; contador++)
	{
		potencia = potencia * base;
	}
	return potencia;
}

int factorial(int x){

	int contador, factorial = 1;
	for (contador = 1; contador <= x; contador++)
	{
		factorial = factorial * contador;
	}
	return factorial;
}
