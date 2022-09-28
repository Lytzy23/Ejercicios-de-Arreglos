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

public class Ejercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //se pide al usuario indicar el tamaño de números
        String texto=JOptionPane.showInputDialog("Introduce el tamaño de numeros primos que quieres");
        //se crea el arreglo
        int num[]=new int[Integer.parseInt(texto)];
        //se invocan las funciones
        rellenarNumPrimosAleatorioArray(num, 1, 100); 
        mostrarArray(num);      
        //se obtiene el numero primo mayor 
        int primoMayor=mayor(num);
        //se imprime el número primo mayor
        System.out.println("El numero primo más grande es el "+primoMayor);
    }
   
    public static void rellenarNumPrimosAleatorioArray(int lista[], int a, int b){ 
        int i=0;
        //inicia el ciclo while
        while(i<lista.length){           
            //solo aumentara cuando genere un número primo
            int num=((int)Math.floor(Math.random()*(a-b)+b));           
            if (esPrimo(num)){              
                lista[i]=num;               
                i++;            
            }       
        }   
    }   
    private static boolean esPrimo (int num){                
        //Un numero negativo, el 0 y el 1, son directamente nueros no primos.
        if (num<=1){
            return false;
        }else{
            //declaracion       
            int prueba;         
            int contador=0;
            //Hacemos la raiz cuadrada y lo usamos para dividir el numero original
            prueba=(int)Math.sqrt(num);
            //Bucle que cuenta los numeros divisibles, podemos hacerlo con while
            for (;prueba>1;prueba--){
                if (num%prueba==0){
                    contador+=1;
                }
            }
            return contador < 1;
        }
    }
    public static void mostrarArray(int lista[]){
        //inicia el ciclo
        for(int i=0;i<lista.length;i++){
            //se muestra el resultado de los numeros que se pidió ingresar
            System.out.println("En el indice "+i+" esta el valor "+lista[i]);
        }
    }   
    public static int mayor(int lista[]){
        int mayor=0;
        for(int i=0;i<lista.length;i++){
            if(lista[i]>mayor){
                mayor=lista[i];
            }
        }      
        return mayor;
    }    
}
