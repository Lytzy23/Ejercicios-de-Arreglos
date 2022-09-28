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
public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        //Creo un array
        int[] numeros=new int[100];
        //Declaro las variables necesarias
        int suma=0;
        double media;
        //Recorro el arreglo, asigno números y sumo
        for(int i=0;i<numeros.length;i++){
            numeros[i]=i+1;
            suma+=numeros[i];
        }
        //Calculo la media y muestro la suma y la meda
        System.out.println("La suma es "+suma);
        media=(double)suma/numeros.length;
        System.out.println("La media es "+media);
    }   
}
