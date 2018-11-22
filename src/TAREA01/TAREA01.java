//SOLO FUNCIONA CON ENTEROS , SALE ERROR SI SE PONEN DECIMALES
package TAREA01;

import java.util.Scanner;
import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static java.sql.Types.NULL;
public class TAREA01 {
    public static void main(String[] args) {
        double x;
        
        Scanner num = new Scanner(System.in);
       try {
           for (int i=1;i<=20;i++){
            double numero=(double) Math.random()*(5-(-5)+1)+(-5) ;System.out.println("Numero random "+i+" = "+numero);
            Cal(numero);}
        } catch (Exception e) {
            System.out.println("ERROR: Datos incorrectos.");
        }
      
    }
    static void Cal(double numero){
        //Primer punto, pasa "a" a radianes.
        double E = 2.7182818284590452354;
        double x=(Math.sin(Math.pow(E, numero)/Math.pow(numero,-1)));
        System.out.println("El resultado es: " + x );
       
    }
}
