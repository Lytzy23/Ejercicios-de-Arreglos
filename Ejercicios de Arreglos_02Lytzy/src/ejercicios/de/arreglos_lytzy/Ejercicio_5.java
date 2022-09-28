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

public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se crea el arreglo
        int[] array1={1,2,3,4,5};       
        int[] array2=new int[array1.length];
        //inicia el ciclo
        for(int i=(array1.length-1),j=0;i>=0;i--,j++){
           array2[j]=array1[i];
           //se imprime el resultado 
           System.out.println(array2[j]);
        }
    }    
}
