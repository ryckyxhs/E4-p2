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

public class ejercicio8 {
    
    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base;
        double altura;

        System.out.print("Ingrese la base: ");
        base = sc.nextDouble();

        System.out.print("Ingrese la altura: ");
        altura = sc.nextDouble();

        double area = calcularArea(base, altura);

        System.out.println("Area: " + area);
    }
}
    

