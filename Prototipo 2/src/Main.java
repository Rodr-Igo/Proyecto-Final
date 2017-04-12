import java.io.*;
public class Main
{

    public static void main(String[] args)
    {
        File Lista = new File("C:\\Users\\Anton\\IdeaProjects\\Prototipo 2\\Lista.xls");
        crearExcel hola = new crearExcel();
        hola.Crear(Lista);

    }
}
