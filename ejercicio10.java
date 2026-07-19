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
public class ejercicio10 {
    public static int mayor(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;

        System.out.print("Ingrese el primer numero: ");
        a = sc.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        b = sc.nextInt();

        int resultado = mayor(a, b);

        System.out.println("El numero mayor es: " + resultado);
    }
}
    

