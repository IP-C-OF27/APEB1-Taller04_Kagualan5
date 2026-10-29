
import java.util.Scanner;

/**
 * Ejercicio 03: "Se desea desarrollar un algoritmo que permita mostrar la tabla
 * de multiplicar de un número ingresado por el usuario; solo en el caso que el
 * valor del número esté entre 2 y 6. No use aún, ciclos repetitivos."
 *
 * @author Kenny Gualan
 * @version 1.0
 */
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero");
        num = tcl.nextInt();
        if (num >= 2 && num <= 6) {
            System.out.println(" --Tabla de multiplicar del: "+(num));
            System.out.println(num + " x 1= " + (num * 1) + "    ");
            System.out.println(num + " x 2= " + (num * 2) + "    ");
            System.out.println(num + " x 3= " + (num * 3) + "    ");
            System.out.println(num + " x 4= " + (num * 4) + "    ");
            System.out.println(num + " x 5= " + (num * 5) + "    ");
            System.out.println(num + " x 6= " + (num * 6) + "    ");
            System.out.println(num + " x 7= " + (num * 7) + "    ");
            System.out.println(num + " x 8= " + (num * 8) + "    ");
            System.out.println(num + " x 9= " + (num * 9) + "    ");
            System.out.println(num + " x 10= " + (num * 10) + "    ");
            System.out.println(num + " x 11= " + (num * 11) + "    ");
            System.out.println(num + " x 12= " + (num * 12) + "    ");
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
Ingrese un numero
5
 --Tabla de multiplicar del: 5
5 x 1= 5    
5 x 2= 10    
5 x 3= 15    
5 x 4= 20    
5 x 5= 25    
5 x 6= 30    
5 x 7= 35    
5 x 8= 40    
5 x 9= 45    
5 x 10= 50    
5 x 11= 55    
5 x 12= 60    
BUILD SUCCESSFUL (total time: 1 second)
 */