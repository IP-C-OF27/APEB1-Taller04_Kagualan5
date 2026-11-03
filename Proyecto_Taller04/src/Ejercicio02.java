import java.util.Scanner;
/**
 * Ejercicio 02: "Generar un algoritmo que permite ingresar los gastos de tres
 * hijos de un padre de familia; calcular y mostrar el total de gastos de los 
 * hijos del padre de familia."
 * @author Kenny Gualan
 * @version 1.0
 */
public class Ejercicio02 
{
    public static void main(String[] args) 
    {
        Scanner tcl = new Scanner(System.in);
        double gastoHijo1,gastoHijo2,gastoHijo3,gastoTotal;
        System.out.print("Deme gastos: ");
        gastoHijo1 = tcl.nextDouble();
        gastoHijo2 = tcl.nextDouble();
        gastoHijo3 = tcl.nextDouble();
        gastoTotal = (gastoHijo1+ gastoHijo2+ gastoHijo3);
        System.out.println("Total de gastos son: " + gastoTotal);
    }
}
/***
 * EVIDENCIA DEL RUN:
Deme gastos: 100 30 90
Total de gastos son: 220.0
BUILD SUCCESSFUL (total time: 5 seconds)
 */
