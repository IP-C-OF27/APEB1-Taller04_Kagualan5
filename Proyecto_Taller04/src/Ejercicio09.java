import java.util.Scanner;
/**
 * Ejercicio 01: "Desarrolle una solución que determine el estado académico de 
 * una persona estudiante en una asignatura universitaria a partir de una 
 * calificación de evaluación continua, una calificación de examen final 
 * y un porcentaje de asistencia. La regla institucional establece que:
La asistencia mínima debe alcanzarse para ser evaluado
Existe una nota mínima en el examen final, y
La nota final se calcula combinando evaluación continua y examen final.
La salida debe indicar “Aprobado”, “Supletorio” o “Reprobado”, y mostrar la 
* nota final redondeada a un decimal."
 * @author Kenny Gualan
 * @version 1.0
 */
public class Ejercicio09 
{
    public static void main(String[] args) 
    { 
        Scanner teclado = new Scanner(System.in);   
        double ASISTENCIA_MINIMA = 70;
        double EXAMEN_MINIMO = 5;
        double NOTA_APROBADO = 7;
        double NOTA_SUPLETORIO = 5;
        double PESO_CONTINUA = 0.40; 
        double PESO_EXAMEN = 0.60;   
        System.out.print("Nota de evaluacion continua (0 a 10): ");
        double continua = teclado.nextDouble();
        System.out.print("Nota del examen final (0 a 10): ");
        double examen = teclado.nextDouble();
        System.out.print("Porcentaje de asistencia (0 a 100): ");
        double asistencia = teclado.nextDouble();
        if (continua < 0 || continua > 10 || examen < 0 || examen > 10
                || asistencia < 0 || asistencia > 100) {
            System.out.println("Error: las notas van de 0 a 10 "
                    + "y la asistencia de 0 a 100.");
        } 
        else 
        {
            double notaFinal = continua * PESO_CONTINUA + examen * PESO_EXAMEN;
            notaFinal = Math.round(notaFinal * 10) / 10.0;
            String estado;
            if (asistencia < ASISTENCIA_MINIMA || examen < EXAMEN_MINIMO) 
            {
                estado = "Reprobado";          
            } 
            else if (notaFinal >= NOTA_APROBADO) {
                estado = "Aprobado";
            }
            else if (notaFinal >= NOTA_SUPLETORIO) {
                estado = "Supletorio";
            }
            else
            {
                estado = "Reprobado";
            }
            System.out.println("Nota final: " + notaFinal);
            System.out.println("Estado: " + estado);
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
Nota de evaluacion continua (0 a 10): 8
Nota del examen final (0 a 10): 7
Porcentaje de asistencia (0 a 100): 75
Nota final: 7.4
Estado: Aprobado
BUILD SUCCESSFUL (total time: 8 seconds)
 */
