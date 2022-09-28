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
import javax.swing.JOptionPane;

public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        //se crean las variables
        final int tamano=15;
        //se crea el arreglo
        int num[]=new int[tamano];
 
        //Invocamos las funciones
        rellenarArray(num);
        mostrarArray(num);
    }
    public static void rellenarArray(int lista[]){
        //inicia el ciclo
        for(int i=0;i<lista.length;i++){
            //se pide ingresar 15 numeros diferentes
            String texto=JOptionPane.showInputDialog("Introduce un número diferente 15 veces");
            lista[i]=Integer.parseInt(texto);
        }
    }
    public static void mostrarArray(int lista[]){
        //inicia el ciclo
        for(int i=0;i<lista.length;i++){
            //se muestra el resultado 
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }   
}
