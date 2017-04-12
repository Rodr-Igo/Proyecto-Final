/**
 * Created by Anton on 3/20/2017.
 */
import java.io.*;
public class Archivo
{
    void crearLista(File lista)
    {
        try {
            if (!lista.exists()) {
                lista.createNewFile();
            }
        }
        catch(Exception e)
        {

        }
    }
    void nuevoAlumno(File lista,String matricula,String nombre)
    {
        try{
        BufferedWriter mat = new BufferedWriter(new FileWriter(lista,true));
        mat.write(System.lineSeparator()+ matricula+"-"+nombre + "-"+",.,.,.,.,.,.");
        mat.close();}
        catch (Exception e){

        }

    }
    void pasarLista(File lista,String matricula,String sesion)
    {

    }
}
