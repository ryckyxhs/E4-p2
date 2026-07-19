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
public class ejercicio3 {

    public static void saludar(String nombre) {
        System.out.println("Bienvenido " + nombre);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.print("Ingrese su nombre: ");
        nombre = sc.nextLine();

        saludar(nombre);
    }
}