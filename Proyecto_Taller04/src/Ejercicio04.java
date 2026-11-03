import java.util.Scanner;
/**
 * Ejercicio 04: "Generar un algoritmo que permita calcular y mostrar el valor 
 * de la planilla de teléfono de un casa. Se debe ingresar el costo por minutos,
 * el número de minutos consumidos en el mes."
 * @author Kenny Gualan
 * @version 1.0
 */
public class Ejercicio04 
{
    public static void main(String[] args) 
    {
        Scanner tcl = new Scanner(System.in);
        double Costominuto, Minutocons, planilla;
        System.out.println("Planilla de Teléfono");
        System.out.println("Ingrese el valor de costo por minuto");
        Costominuto = tcl.nextDouble();
        System.out.println("Ingrese el valor de minutos consumidos");
        Minutocons = tcl.nextDouble();
        planilla= (Costominuto* Minutocons);
        System.out.println("El valor de la planilla es: "+ planilla);
    }
}
/***
 * EVIDENCIA DEL RUN:
Planilla de Tel�fono
Ingrese el valor de costo por minuto
9
Ingrese el valor de minutos consumidos
5
El valor de la planilla es: 45.0
BUILD SUCCESSFUL (total time: 7 seconds)
 */