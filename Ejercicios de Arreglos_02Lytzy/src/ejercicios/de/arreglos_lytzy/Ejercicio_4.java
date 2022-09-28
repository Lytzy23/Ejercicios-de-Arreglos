/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.de.arreglos_lytzy;

/**
 *
 * @author Giovanni Mendez
 */
import java.util.Scanner;
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
        //se crea el arreglo
        char letrasMayusculas[] = new char[26];
        //comienza el ciclo
        for (int i = 65, j = 0; i <= 90; i++, j++) {
            letrasMayusculas[j] = (char) i;
        }
        String cadena = "";
        int eleccion = -1;       
        do {
            //se piden los datos al usuario
            System.out.println("Elija una posición entre 0 y " + (letrasMayusculas.length - 1) + " e ingrese -1 para finalizar");
            eleccion = sc.nextInt();
            if (!(eleccion >= 0 && eleccion <= letrasMayusculas.length - 1)) {
                //se muestra el mensaje cuando se ingresan valores fuera de la longitud
                System.out.println("Error, inserte otro numero");
            } else {
                if (eleccion != -1) {
                    cadena += letrasMayusculas[eleccion];
                }
            }
        } while (eleccion != -1);
        //se muestra el resultado
        System.out.println("Cadena resultante: " + cadena);
    }    
}
