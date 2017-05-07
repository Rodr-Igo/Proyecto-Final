import java.io.File;
import java.util.Scanner;
import jxl.Cell;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class Excel {
    public static void CrearExcel(String direccion)
    {
        /*
funcion:CrearExcel
Descripcion
Autor:Moises Abraham Vinajera Sosa/Rodrigo Daniel Euan Briceño
Fecha:30/04/17
Notas:
*/
        try
        {
            int fila;
            int columna;
            WritableWorkbook workbook = Workbook.createWorkbook(new File(direccion));
            workbook.createSheet("Hoja", 0);
            WritableSheet copySheet = workbook.getSheet(0);
            Label nom;
            nom =new Label(0,0,"Nombre");
            copySheet.addCell(nom);
            Label mat= new Label(1,0,"matricula");
            copySheet.addCell(mat);
            Label etiqueta;
            for(fila=2;fila<12;fila++)
            {
                columna=fila-1;
                etiqueta= new Label(fila,0,"Clase "+columna);
                copySheet.addCell(etiqueta);

            }
            workbook.write();
            workbook.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void CopiarExcel(String direccion,String matriz[][])
    {
        /*
funcion:CopiarExcel
Descripcion: Toma los datos de Excel en un rango de 20 filas y 12 columnas y los copia en una matriz para uso en otras
funciones.
Autor: José Antonio Barrera Morales
Fecha:30/04/17
Notas:
*/
        try
        {
            int columna;
            int fila;
            Workbook wb = Workbook.getWorkbook(new File(direccion));
            WritableWorkbook copy = Workbook.createWorkbook(new File(direccion), wb);
            WritableSheet hoja= copy.getSheet(0);
            Cell celda;
            for(columna=0;fila<20;columna++)
            {
                for(fila=0;fila<12;fila++)
                {
                    celda= hoja.getCell(fila,columna);
                    matriz[columna][fila] = celda.getContents();
                }
            }
            copy.write();
            copy.close();

        }
        catch(Exception e)
        {

        }
    }
    public static void CopiarMatriz(String direccion,String matriz[][])
    {
        /*
funcion:CopiarMatriz
Descripcion: Copia los datos que modificamos en la matriz para actualizar el documento excel
Autor:Jose Antonio Barrera/Rodrigo Daniel Euan Briceño
Fecha:30/04/17
Notas:
*/
        try
        {
            int i;
            int j;
            Workbook wb = Workbook.getWorkbook(new File(direccion));
            WritableWorkbook copy = Workbook.createWorkbook(new File(direccion), wb);
            WritableSheet hoja= copy.getSheet(0);
            Label celda;
            for(i=0;i<12;i++)
            {
                for(j=0;j<20;j++)
                {
                    celda= new Label(i,j,matriz[j][i]);
                    hoja.addCell(celda);
                }
            }
            copy.write();
            copy.close();
        }
        catch(Exception e)
        {

        }
    }
    public static void InsertarAlumno(String matriz[][])
    {
        /*
funcion:InsertarAlumno
Descripcion: modifica la matriz para agregar un nombre y una matricula en su debida columna
Autor:Jose Antonio Barrera Morales
Fecha:1/05/17
Notas:Sobre escribe los nombres en la misma fila; requiere edicion
*/
        try
        {
            int columna=0;
            String nombre,matricula;
            Scanner nom = new Scanner(System.in);
            Scanner mat = new Scanner(System.in);
            System.out.println("Ingresar Nombre");
            nombre=nom.nextLine();
            System.out.println("Ingresar Matricula");
            matricula=mat.nextLine();
            do
            {
                columna++;
                System.out.print("asd");
            }while (matriz[columna][0]=="0");
            matriz[columna][0]=nombre;
            matriz[columna][1]=matricula;


        }catch(Exception e){}
    }
    public static void PasarLista(int clase,String matriz[][])
    {
        /*
funcion:PasarLista
Descripcion:recibe una matricula y la clase y busca la amtricula e ingresa una asistencia "1" en su respectiva
Autor:José Antonio Barrera Morales/Rodrigo Daniel Euan Briceño
Fecha:1/05/17
Notas:
*/
        try
        {
            int columna=1;
            String matricula;
            Scanner mat= new Scanner(System.in);
            System.out.println("Ingresa matricula");
            matricula= mat.nextLine();
            while(matriz[columna][1]!=matricula && matriz[columna][1]!="0")
            {
                columna++;
            }
            clase++;
            matriz[columna][clase]="1";
        }
        catch(Exception e){}
    }
}