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
public class ejercicio4 {
    
    public static void mostrarDatos(String nombre, int edad) {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);

        if (edad >= 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("Menor de edad");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad;

        System.out.print("Ingrese el nombre: ");
        nombre = sc.nextLine();

        System.out.print("Ingrese la edad: ");
        edad = sc.nextInt();

        mostrarDatos(nombre, edad);
    }
}
    

