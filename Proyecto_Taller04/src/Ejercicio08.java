import java.util.Scanner;
/**
 * Ejercicio 01: "Se debe generar una solución que permita calcular y mostrar 
 * el valor total a pagar mensual de servicios digitales de una persona. 
 * Los servicios digitales son: netflix, youtube premium, dropbox, spotify.
 * Si la persona es menor a 30 años se descuenta el 20% del total mensual."
 * @author Kenny Gualan
 * @version 1.0
 */
public class Ejercicio08 
{
    public static void main(String[] args) 
    {
        Scanner tcl = new Scanner(System.in);
        double netflix, youtubepremium, dropbox, spotify, total;
        int edad;
        System.out.print("Ingrese valor total de la aplicacion Netflix:$ ");
        netflix= tcl.nextDouble();
        System.out.print("Ingrese valor total de youtubepremium:$ ");
        youtubepremium= tcl.nextDouble();
        System.out.print("Ingrese valor total de dropbox:$ ");
        dropbox= tcl.nextDouble();
        System.out.print("Ingrese valor total de Spotify:$ ");
        spotify= tcl.nextDouble();
        System.out.print("Ingrese su edad: ");
        edad= tcl.nextInt();
        total= netflix+ youtubepremium+ dropbox+ spotify;
        if (edad < 30 )
        {
            total= total -(total* 0.20);
        }  
        System.out.println("El valol total mensual es:$ "+ total);
    }
}

/***
 * EVIDENCIA DEL RUN:
Ingrese valor total de la aplicacion Netflix:$ 5
Ingrese valor total de youtubepremium:$ 8
Ingrese valor total de dropbox:$ 15
Ingrese valor total de Spotify:$ 4
Ingrese su edad: 18
El valol total mensual es:$ 25.6
BUILD SUCCESSFUL (total time: 23 seconds)
 */