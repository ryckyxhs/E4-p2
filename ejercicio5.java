/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e4p2;

/**
 *
 * @author Ricardo Abraham Ordoñez Narvaez
 */
import java.util.Scanner;
public class ejercicio5 {

    public static void operaciones(double a, double b) {
        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));

        if (b != 0) {
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("No se puede dividir para cero");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;

        System.out.print("Ingrese el primer numero: ");
        a = sc.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        b = sc.nextDouble();

        operaciones(a, b);
    }
}
    

