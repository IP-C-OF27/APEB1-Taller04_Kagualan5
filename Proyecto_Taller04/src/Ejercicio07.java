import java.util.Scanner;
/**
 * Ejercicio 01: "Generar un algoritmo que permita calcular y mostrar el valor
 * a cancelar de una planilla de luz. Se debe ingresar el valor de costo por 
 * kilovatio/hora y el número de kilovatios consumidos en el mes. Si el usuario
 * tiene edad mayor a 65 años, se debe descontar el 10%."
 * @author Kenny Gualan
 * @version 1.0
 */
public class Ejercicio07 
{
    public static void main(String[] args) 
    {
        Scanner tcl = new Scanner(System.in);
        double valorkilovatio, numkilovatios,total;
        int edad;
        System.out.println("Ingrese el costo por Kilovatio/hora: ");
        valorkilovatio= tcl.nextDouble();
        System.out.println("Ingrese los kilovatios consumidos en el mes: ");
        numkilovatios= tcl.nextDouble();
        System.out.println("Ingrese la edad del usuario: ");
        edad= tcl.nextInt();
        total= valorkilovatio * numkilovatios;
        if (edad >= 65)
        {
            total= total - (total* 0.10);         
        }
        System.out.println("EL valor total de cancelar es:$ "+ total);        
    }
}
/***
 * EVIDENCIA DEL RUN:
Ingrese el costo por Kilovatio/hora: 
0,97
Ingrese los kilovatios consumidos en el mes: 
100
Ingrese la edad del usuario: 
67
EL valor total de cancelar es:$ 87.3
BUILD SUCCESSFUL (total time: 13 seconds)
 */