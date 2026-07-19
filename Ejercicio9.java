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
public class Ejercicio9 {
     public static double calcularPromedio(double n1, double n2, double n3){
    return (n1+n2+n3)/3;
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1;
        double n2;
        double n3;
        double promedio;
         
        System.out.print("Ingrese la nota 1:");
            n1 = sc.nextDouble();
             System.out.print("Ingrese la nota 2:");
            n2 = sc.nextDouble();
             System.out.print("Ingrese la nota 3:");
            n3 = sc.nextDouble();
            
            promedio = calcularPromedio( n1,  n2, n3);
            
            System.out.println("Promedio:" +promedio);
            
             if (promedio >= 7) {
            System.out.println("Aprobo");
        } else {
            System.out.println("Reprobo");
    }
    }
}

            
            
           

