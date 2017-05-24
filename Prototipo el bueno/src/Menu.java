import java.util.Scanner;


public class Menu
{
    public static void AbrirMenu(String matriz[][])
    {
        /*
Funcion:AbrirMenu
Descripcion: Entra a un ciclo while que selecciona distinas opciones usando el char "opcion" para moverse entre distinas funciones para modificar la matriz
Autor:José Antonio Barrera Morales/Moises Abraham Vinajera Sosa
Fecha:30/04/17
Notas:
*/
        char opcion='s',opcionPasandoLista;
        try
        {
            Excel b= new Excel();

            while(opcion!='n')
            {
                Scanner seleccionar = new Scanner(System.in);
                System.out.println("Selecciona Opcion");
                System.out.println("1.- Ingresar Alumno");
                System.out.println("2.- Pasar lista");
                System.out.println("n.- salir");
                opcion= seleccionar.next().charAt(0);
                switch (opcion)
                {
                    case '1':
                        b.InsertarAlumno(matriz);
                        break;
                    case '2':
                        Scanner c= new Scanner(System.in);
                        int clase;
                        System.out.println("Ingresa la clase");
                        clase= c.nextInt();
                        do
                        {
                            b.PasarLista(clase,matriz);
                            System.out.println("Seguir?");
                            Scanner seguir = new Scanner(System.in);
                            opcionPasandoLista= seguir.next().charAt(0);
                        }while(opcionPasandoLista!='n');
                        break;
                    default:
                        if(opcion!='n'){
                            System.out.println("opcion no valida");}
                        break;
                }
            }
        }
        catch(Exception e){}
    }
}

