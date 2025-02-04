/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo_java;

/**
 *
 * @author paulo
 */
public class Ejemplo_java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int numero = 5;
        int numero2 = factor(numero);
        
        System.out.printf("El factorial de %d es: %d\n",
                numero, numero2);

    }

    public static int factor(int a) {

        int numero;

        if (a == 0 || a == 1) {
            return 1; // Caso base
        } else {
            numero = a * factor(a - 1); // Llamada recursiva
        }

        return numero;
    }
}
