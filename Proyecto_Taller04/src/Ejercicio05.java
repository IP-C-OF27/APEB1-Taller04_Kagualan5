import java.util.Scanner;
/**
 * Ejercicio 05: "Generar un algoritmo que permita calcular y mostrar el costos
 * de una computadora de escritorio. La misma es comprada por partes; CPU, 
 * teclado, pantalla, ratón."
 * @author Kenny Gualan
 * @version 1.0
 */
public class Ejercicio05 
{
    public static void main(String[] args) 
    {
        Scanner tcl = new Scanner(System.in);
        double cpu,teclado,pantalla,raton, total;
        System.out.print("Ingrese el precio del cpu:$ ");
        cpu = tcl.nextDouble();
        System.out.print("Ingrese el precio del teclado:$ ");
        teclado= tcl.nextDouble();
        System.out.print("Ingrese el precio de la pantalla:$ ");
        pantalla = tcl.nextDouble();
        System.out.print("Ingrese el precio del raton:$ ");
        raton = tcl.nextDouble();
        total= (cpu + teclado + pantalla + raton );
        System.out.println("El valor total de la computadora es:$ " + total);
    }
}
/***
 * EVIDENCIA DEL RUN:
Ingrese el precio del cpu:$ 100
Ingrese el precio del teclado:$ 20
Ingrese el precio de la pantalla:$ 15
Ingrese el precio del raton:$ 12
El valor total de la computadora es:$ 147.0
BUILD SUCCESSFUL (total time: 6 seconds)
 */