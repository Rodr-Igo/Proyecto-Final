import java.util.Scanner;
import java.io.*;

/**
 * Created by Anton on 3/22/2017.
 */
public class Menu
{
    void AbrirMenu(File lista,Archivo archivo)
    {
        char n='s';
        while(n!='n')
        {

            Scanner opcion= new Scanner(System.in);
            System.out.println("Ingresa opcion\n1.- ingresar nuevo alumno\n2.- Pasar Lista\nn.-Salir");
            n=opcion.next().charAt(0);

            switch(n){
                case '1':
                    String nombre;
                    String matricula;
                    Scanner nom= new Scanner(System.in);
                    Scanner mat= new Scanner(System.in);
                    System.out.println("ingresar Matricula");
                    matricula=mat.next();
                    System.out.println("ingresar Nombre");
                    nombre=nom.next();
                    archivo.nuevoAlumno(lista,matricula,nombre);
                    break;
                case '2':
                    break;
                case 'n':
                    break;
                default:
                    System.out.println("opcion incorrecta");

            }
            System.out.println("Desdea Continuar");
        }
    }
}
