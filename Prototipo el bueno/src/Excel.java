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
Autor:Moises Abraham Vinajera Sosa
Fecha:30/04/17
Notas:
*/
        try
        {
            int i,j;
            WritableWorkbook workbook = Workbook.createWorkbook(new File(direccion));
            workbook.createSheet("Hoja", 0);
            WritableSheet copySheet = workbook.getSheet(0);
            Label nom;
            nom =new Label(0,0,"Nombre");
            copySheet.addCell(nom);
            Label mat= new Label(1,0,"matricula");
            copySheet.addCell(mat);
            Label etiqueta;
            for(i=2;i<12;i++)
            {
                j=i-1;
                etiqueta= new Label(i,0,"Clase "+j);
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
Descripcion: Toma los datos de Excel en un rango de 20 filas y 12 columnas y los copia en una matriz para uso en otras funciones
Autor: José Antonio Barrera Morales
Fecha:30/04/17
Notas:
*/
        try
        {
            int i,j;
            Workbook wb = Workbook.getWorkbook(new File(direccion));
            WritableWorkbook copy = Workbook.createWorkbook(new File(direccion), wb);
            WritableSheet hoja= copy.getSheet(0);
            Cell celda;
            for(i=0;i<20;i++)
            {
                for(j=0;j<12;j++)
                {

                    celda = hoja.getCell(j, i);
                    if(celda.getContents()!="")
                    {
                        matriz[i][j] = celda.getContents();
                    }
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
Autor:Jose Antonio Barrera
Fecha:30/04/17
Notas:
*/
        try
        {
            int i,j,fila,columna;
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
            int j=1,fila,columna;
            String nombre,matricula;
            Scanner nom = new Scanner(System.in);
            Scanner mat = new Scanner(System.in);
            System.out.println("Ingresar Nombre");
            nombre=nom.nextLine();
            System.out.println("Ingresar Matricula");
            matricula=mat.nextLine();

            while (matriz[j][0].compareTo("0")!=0)
            {
                j++;
            }
            matriz[j][0]=nombre;
            matriz[j][1]=matricula;



        }catch(Exception e){}
    }
    public static void PasarLista(int clase,String matriz[][])
    {
        /*
funcion:PasarLista
Descripcion:recibe una matricula y la clase y busca la amtricula e ingresa una asistencia "1" en su respectiva
Autor:José Antonio Barrera Morales
Fecha:1/05/17
Notas:
*/
        try
        {
            int j=1;
            String matricula;
            Scanner mat= new Scanner(System.in);
            System.out.println("Ingresa matricula");
            matricula= mat.nextLine();
            while(matriz[j][1].compareTo(matricula)!=0&& matriz[j][1].compareTo("0")!=0)
            {
                j++;
            }
            clase++;
            matriz[j][clase]="1";
        }
        catch(Exception e){}
    }
}