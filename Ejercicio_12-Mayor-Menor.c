#include <stdio.h>

int main(int argc, char *argv[]) {
	int Monto_prestamo,Residuo_cuenta,Porcentaje_interes,Abono, Meses, Contador = 0, Monto_por_mes = 0,Sumador;

  printf("Ingrese el dinero que tienes en la cuenta:\n");
	scanf("%d\n", Monto_prestamo);

	printf("Ingrese el interes que se le cobrara anualmente\n");
	scanf("%d\n",Porcentaje_interes);

	printf("Ingrese el Abono\n");
	scanf("%d\n", Abono);

	printf("¿Cuantos meses llevas pagados?:\n");
	scanf("%d\n", Meses);

	for (Contador = 0; Contador < Meses; Contador++) {

				Sumador = (1+Porcentaje_interes/12)^Contador;
				Monto_por_mes = Monto_por_mes + Sumador;

	}

	Residuo_cuenta = ((Monto_prestamo*(1 + (Porcentaje_interes/12))) ^ Meses) - (Abono * Monto_por_mes);

printf("Este es el residuo de la cuenta: %d y fueron en : %d\n",Residuo_cuenta, Meses);

	return 0;
}