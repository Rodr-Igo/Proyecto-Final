import java.util.Scanner;
import java.io.*;
public class Main {

    public static void main(String[] args) {
        Archivo archivo=new Archivo();
        File lista=new File("C:\\Users\\Anton\\Desktop\\lista.txt");
        archivo.crearLista(lista);
        Menu menu= new Menu();
        menu.AbrirMenu(lista,archivo);

    }
}
