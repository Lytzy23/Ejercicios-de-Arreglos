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
public class Ejercicio_3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {       
        //se crea el arreglo
        int[] numeros=new int[100];       
        //se declaran las variables
        int laSuma=0;
        double laMedia;        
        //se recorre el arreglo, se asignan números y la suma
        for(int i=0;i<numeros.length;i++){
            numeros[i]=i+1;
            laSuma+=numeros[i];
        }        
        //se calcula la media y se muestra la suma
        System.out.println("La suma es "+laSuma);        
        laMedia=(double)laSuma/numeros.length;   
        //se muestra la media abajo de la suma 
        System.out.println("La media es "+laMedia);       
    }  
}
