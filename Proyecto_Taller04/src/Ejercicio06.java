import java.util.Scanner;
/**
 * Ejercicio 06: "Generar un solución que permita calcular y mostrar el pago
 * mensual de un préstamo de 1 año de plazo. Se debe ingresar el monto del
 * préstamo y el interés mensual a cobrar."
 * @author Kenny Gualan
 * @version 1.0
 */
public class Ejercicio06 
{
    public static void main(String[] args) 
    {
        Scanner tcl = new Scanner(System.in);
        double monto, interes, interesmensual, pagomensualtotal ;
        System.out.print("Ingrese el valor de monto del prestamo:$ ");
        monto= tcl.nextDouble();
        System.out.print("Ingrese el porcentaje de interes mensual: ");
        interes= tcl.nextDouble();
        interesmensual= (monto* interes/100);
        pagomensualtotal= (monto/12 +interesmensual);
        System.out.println("El valor de pago mensual total es:$ "+ 
        pagomensualtotal);   
    }
}
/***
 * EVIDENCIA DEL RUN:
Ingrese el valor de monto del prestamo:$ 1200
Ingrese el porcentaje de interes mensual: 4
El valor de pago mensual total es:$ 148.0
BUILD SUCCESSFUL (total time: 18 seconds)
 */