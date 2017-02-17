
/*
Autor:Wendy Sosa 14/febrero/17
Entradas: mes (int),año(int)
Salidas: calendario_mes(int)
Procedimiento general:
Se lee el mes y el año

Se asignan cuantos meses tiene cada mes,si el año es bisiesto se asignan 29 a febrero.
se calcula si el año es bisiesto o no.
Se calcula cuando comienza el dia 1 del mes indicado usando una formula para
enero o febrero y otra formula para los demas meses.
Se imprimen con un ciclo for los dias de la semana y los dias del mes.

*/
#include <stdio.h>
int bisiesto(int);
int dias_meses(int,int);
int inicio_mes(int,int);
void calendario_mes(int,int);

int main(int argc, char *argv[]) {
	/*Entradas*/
	int mes,anio;
	printf ("Introduzca año:\n");
	scanf("%d",&anio);
	printf ("Seleccione mes:\n 1.Enero\t 2.Febrero\t 3.Marzo\t 4.Abril\n");
	printf(" 5.Mayo\t\t 6.Junio\t 7.Julio\t 8.Agosto\n 9.Septiembre\t 10.Octubre\t 11.Noviembre\t 12.Diciembre\n");
	scanf("%d",&mes);
	/*Procedimiento y salidas*/
	calendario_mes(mes,anio);
	
	return 0;
}
/*Se imprime el calendario del mes.
Se llama ala funcion "inicio_mes"
para saber desde que dia de semana se empieza a imprimir.
Se llama a la funcion "dias_meses" para decir hasta que numero se imprime.
Se juntan en un ciclo for para imprimir*/
void calendario_mes(int mes,int anio)
{
	int aux,aux2,aux3=1,limite=0,dias,diaDeSemana;
	
	dias=dias_meses(mes,anio);
	diaDeSemana=inicio_mes(mes,anio);
	
	printf("L\t M\t M\t J\t V\t S\t D\t\n");
	for(aux=1;aux<(diaDeSemana);aux++)
	{
		printf (" ""\t");
	}
	for (aux2=diaDeSemana;aux2<=7;aux2++)
	{
		printf ("%d\t",aux3);
		aux3++;
	}	
	printf("\n");	
	
	for(aux3=aux3;aux3<=(dias);aux3++)
	{
		printf ("%d\t",aux3);
		limite++;
		if (limite%7==0)
		{
			printf("\n");
		}	
	}
	return;
}
/*Aqui se determina en que dia de la semana comienza el mes (lunes ,martes,
miercoles etc) usando un if porque se usan dos formulas,una para los dos primeros
meses y otra para el resto*/
int inicio_mes(int mes,int anio)
{
	int diaDeSemanaInicial;
	if (mes==1 || mes==2)
	{
		diaDeSemanaInicial=anio+31*(mes-1) +(anio-1)/4-3*((anio+99)/100)/4;
	}
	else
	{
		diaDeSemanaInicial=anio+31*(mes-1) +1-(4*mes+23)/10+anio/4-(3*(anio/100+1))/4;
	}
	diaDeSemanaInicial=(diaDeSemanaInicial%7)-1;
	return diaDeSemanaInicial;	
}


/*Funcion que asigna con un switch cuantos dias tiene cada mes
se llama ala funcion "bisiesto" para designarle 29 o 28 dias a febrero*/
int dias_meses(int mes,int anio)
{
	int dias;
	switch(mes)
	{
	case 1:case 3:case 5:case 7:case 8: case 10: case 12:
		dias=31;
		break;	
		
	case 4:case 6:case 9:case 11:
		dias=30;
		break;
		
	case 2:
		if (bisiesto(anio)==1)
		{
			dias=29;
		}
		else
		{
			dias=28;
		}
		break;
		
	}
	return dias;
}

/*Funcion que determina si el año es bisiesto o no*/
int bisiesto(int anio)
{
	int esBisiesto = 0;
	
	if (anio%4 == 0)
	{
		if (anio%100 == 0)
		{
			if (anio%400 == 0)
			{
				
				esBisiesto = 1;
			}			
		}
		
		else
		{
			esBisiesto = 1;	
		}
	}
	return esBisiesto;
}
