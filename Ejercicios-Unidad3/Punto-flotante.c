#include <stdio.h>
void contadorDecimales (float _numeroDecimal);

int main(int argc, char const *argv[]) {
float numero;

printf("Ingrese el numero racinal a rendondear\n");
scanf("%f", numero);
contadorDecimales(_numeroDecimal);
  return 0;
}

void contadorDecimales(float _numeroDecimal)
{
  int contadorDecimales = 0;
  float parteDecimal = 0;

  parteDecimal = _numeroDecimal- (int)_numeroDecimal;
  while (parteDecimal > 0)
  {
      contadorDecimales++;
      parteDecimal = parteDecimal * 10;

      parteDecimal = parteDecimal - (int)parteDecimal;
      printf("Iteración %d y parteDecimal:%f\n",contadorDecimales, parteDecimal);
  }
  return;
}
