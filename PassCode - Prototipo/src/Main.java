import java.io.File;

public class Main {
    /*
Autor:Moisés Vinajera Sosa
Fecha:30/04/2017
Notas:Para usar en otro dispositivo: modificar string de dirección
Descpcion:
Ésa es la clase principal en donde se corre el programa, crea un string donde se almacena la dirección donde se va a almacenar el archivo de Excel
crea una matriz en donde inicializa los valores de sus celdas como "0". Luego crea el archivo y llama a las funciónes dentro de las clases (Excel y menu)

Edicion
Editor:Antonio Barrera/Rodrigo Daniel Euan Briceño
Fecha:1/05/2017
descripcion de edicion:Cambios en el tamaño en la matriz, verificación de los valores dentro de la matriz sea 0.
*/

    public static void main(String[] args)
    {
        String direccion="C:\\Lista.xls";
        String matriz[][]= new String[20][12];
        int fila,columna;
        for(fila=0;fila<20;fila++)
        {
            for(columna=0;columna<12;columna++)
            {
                matriz[fila][columna]="0";
            }
        }
        File file = new File (direccion);
        Excel e = new Excel();
        if (!file.exists())
        {
            e.CrearExcel(direccion);
        }
        e.CopiarExcel(direccion,matriz);
        for(fila=0;fila<20;fila++)
        {
            for(columna=0;columna<12;columna++)
            {
                if(columna==0)
                {
                 System.out.println(matriz[fila][columna]);
                }
                else
                    {
                    System.out.print(matriz[fila][columna]);
                }
            }
        }
        Menu a = new Menu();
        a.AbrirMenu(matriz);
        e.CopiarMatriz(direccion,matriz);
    }
}