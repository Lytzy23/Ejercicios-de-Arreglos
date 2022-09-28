/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.pkg01.arreglos_lytzy;

/**
 *
 * @author ADA UwU
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //Creo el array
        int[] numeros=new int[100];
        //Lo recorro y le asigno números
        for(int i=0;i<numeros.length;i++){
            numeros[i]=i+1;
            System.out.println(numeros[i]);
        }
    }   
}
