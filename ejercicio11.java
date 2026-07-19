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
public class ejercicio11 {
   
    public static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un numero: ");
        int numero = sc.nextInt();

        if (esPar(numero)) {
            System.out.println("El numero es par.");
        } else {
            System.out.println("El numero es impar.");
        }
    }
}
    

