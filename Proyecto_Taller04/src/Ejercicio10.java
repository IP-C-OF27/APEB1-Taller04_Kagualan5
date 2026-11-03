import java.util.Scanner;
/**
 * Ejercicio 01: "Texto del enunciado del ejercicio/problema...."
 * @author NombreAutor
 * @version 1.0
 */
public class Ejercicio10 
{
    public static void main(String[] args) 
    { 
        Scanner teclado = new Scanner(System.in);   
        System.out.print("Lado del cuadrado: ");
        double lado = teclado.nextDouble();
        System.out.print("Altura de los triangulos: ");
        double altura = teclado.nextDouble();
        if (lado <= 0 || altura <= 0) 
        {
            System.out.println("Error: las medidas deben ser mayores que 0.");
        }
        else 
        {
            double areaCuadrado = lado * lado;
            double areaTriangulo = (lado * altura) / 2;
            double areaRectangulo = lado * altura;
            double areaTotal = areaCuadrado + 3 * areaTriangulo + 
                    areaRectangulo;
            System.out.println("Area del cuadrado (A): " + areaCuadrado);
            System.out.println("Area de cada triangulo (B, C, E): " 
                    + areaTriangulo);
            System.out.println("Area del rectangulo (D): " + areaRectangulo);
            System.out.println("Area total del poligono: " + areaTotal);
        }
    }
}
/***
 * EVIDENCIA DEL RUN:
Lado del cuadrado: 7
Altura de los triangulos: 6
Area del cuadrado (A): 49.0
Area de cada triangulo (B, C, E): 21.0
Area del rectangulo (D): 42.0
Area total del poligono: 154.0
BUILD SUCCESSFUL (total time: 7 seconds)
 */