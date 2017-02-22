
# Autor:Equipo 4 15/Febrero/17
# Entradas: valor , longitud (int)
# Salidas valor (int) (agregando el simbolo * si es el caso correspondiente
# Procedimiento general
# Se leen dos valores enteros ( valor y longitud) se llama a la funcion desplegar
# y calcula las cifras del valor, hace una comparacion entre la cifras y la longitud
# y si longitud es mayor hace un ciclo con la diferencia de estas
# (longitud - cifras) para calcular el nnmero de * se tienen que anadir a la impresion.

def function_desplegar(base, cifrasValor):
    #Entradas
    #base: valor de entrada requerido.
    # cifrasValor cantidad de cifras que se requieren en la impresion.
    #cifras: Cantidad de cifras que contiene la base
    #contador = contador del ciclo
    #aux : valor de almacenamiento del valor base
    #aux2 : valor para convertir el valor de la base en string
    cifras = 1
    contador = 0
    aux = base
    aux2 = str(base)
    asteriscos = chr(42)
    # Procedimiento se almacena el valor en una variable auxiliar, un ciclo while calcula las cifras de la base Se hace una comparacion si
    # cumple se hace un ciclo para calcular los * que contendran la impresion.
    while aux/10 != 0:
        aux = aux/10
        cifras = cifras + 1
    if cifrasValor > cifras:
        while contador < cifrasValor - cifras - 1:

                asteriscos = asteriscos + chr(42)
                contador = contador + 1

        print(asteriscos + aux2)
    else:
        print(aux2)
#Entradas
#valor : valor de entrada requerido.
#longitud : cantidad de cifras que se requieren en la impreson.
#lecturaFuncion : Sirve para asignar las variables(valor, longitud)
#como entradas a la funcion desplegar.
print "Intruduce un valor y la longitud con la  que se desplegara"
valor = input()
longitud = input()
#Procedimiento
#Llamar a la funcion lecturaFuncion
function_desplegar(valor, longitud)
x = input()
