import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        //Ejercicio 4
        int numero;
        String auxiliar;

        //Scanner text = new Scanner(System.in);
        //System.out.println("Ingrese el número");
        //numero = text.nextInt();
        auxiliar = JOptionPane.showInputDialog("Ingrese el numero entero que se convertira en binario: ");
        numero = Integer.parseInt(auxiliar);

        numero = binarioAEntero(numero);

        //System.out.println("Este es el numero entero a binario: "+numero);
        JOptionPane.showMessageDialog(null,"Este es el numero a binario: "+ numero);

    }

    public static int binarioAEntero(int x){
        //int contador = 0, resultado = 0;
        int contador=0,digito;
        double resultado=0;
        while(x!=0){
            digito = x%2;
            resultado= resultado+digito*Math.pow(10,contador);
            contador++;
            x=x/2;
        }
        return (int) resultado;
    }
}

        /*
        //Aqui empieza el ejercicio 20

      int n, contador, signo = 1;
      float x, resultado = 1;
      String auxiliar;

      /*
      System.out.println("Ejercicio 20 || Team 4");
      System.out.println("Escribir un programa que realice la aproximacion del valor de Coseno(x) utilizando la serie");
      System.out.println("El programa leera el valor de X y la diferencia de precision dif(ambos flotantes).");
      System.out.println("El programa calculara tanto terminos en la serie como sea necesario.");
      System.out.println("Cuando la diferencia entre el acumulado de la serie y el acumulado con un");
      System.out.println("termino mas");
      System.out.println("sea menor o igual que la diferencia (dif) el algoritmo imprimirael resultado.");
      System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        */
        /*
      JOptionPane.showMessageDialog(null,"Ejercicio 20 || Team 4 \n El programa leerá el valor de X y la diferencia de precisión dif (ambos\n" + "flotantes). El programa calculará tanto términos en la serie como sea\n" +
              "necesario. Cuando la diferencia entre el acumulado de la serie y el\n" +
              "acumulado con un término más sea menor o igual que la diferencia (dif) el\n" +
              "algoritmo imprimirá el resultado.");
      /*System.out.println("Inserta X");
      Scanner denominador = new Scanner(System.in);
      x = denominador.nextFloat();
        */
     /* auxiliar = JOptionPane.showInputDialog("Inserte X: ");
      x = Integer.parseInt(auxiliar);

      /*
      System.out.println("Inserta N");
      Scanner numerador = new Scanner(System.in);
      n = numerador.nextInt();
        */

      /*auxiliar = JOptionPane.showInputDialog("Inserte N: ");
      n = Integer.parseInt(auxiliar);

        for(contador=1;contador<=n;contador++)
        {
            signo=signo*(-1);
            //Operación
            resultado= resultado+ signo*(potencia(x,contador*2)/factorial(contador*2));
        }
        //Salida
        //System.out.println(resultado);
        JOptionPane.showMessageDialog(null, "Este es el resultado de Coseno: "+ resultado);
    }
    //Funciones
    public static int factorial(int numero){
        int i,resultado=1;
        for(i=1;i<=numero;i++){
            resultado=resultado*i;
        }
        return resultado;
    }

    public static float potencia(float base,int potencia){
        float resultado=1;
        int i;
        for(i=1;i<=potencia;i++){
            resultado=resultado*base;
        }
        return resultado;
    }

}
*/