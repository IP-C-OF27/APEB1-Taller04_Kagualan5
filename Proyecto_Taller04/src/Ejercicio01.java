import java.util.Scanner;
/**
 * Ejercicio 01: "Generar un algoritmo que permite calcular y presentar el área
 * de un triángulo. Los datos deben ser pedidos al usuario."
 * @author Kenny Gualan
 * @version 1.0
 */
public class Ejercicio01 
{
    public static void main(String[] args) 
    {
         Scanner tcl = new Scanner(System.in);
         double base, altu, area;
         System.out.print("Deme el valor de base: ");
         base= tcl.nextDouble();
         System.out.print("Deme el valor de altura: ");
         altu= tcl.nextDouble();
         area= (base * altu) / 2;
         System.out.println("Area: " + area);
    }
}
/***
 * EVIDENCIA DEL RUN:
Deme el valor de base: 10
Deme el valor de altura: 5
Area: 25.0
BUILD SUCCESSFUL (total time: 4 seconds)
 */

