/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suma.vectores;

/**
 *
 * @author Estudiante
 */
import java.util.*;
public class SumaVectores {

    
    static int [] addition(int [] a, int [] b){
        
        int [] addvector = new int [a.length];
        for(int j=0;j<a.length;j++){
            
            addvector[j]=a[j]+b[j]; 
 
        }
        return addvector;
}

    public static void main (String [] args){
        
        System.out.println("Suma de vectores");
        System.out.println("Introduzca 3 valores para el vector 1");
        
        Scanner lec=new Scanner(System.in);
        System.out.println("Introduzca el tamaño del vector");
        int tam=lec.nextInt();
        
        int [] vector1= new int [tam];
        int [] vector2= new int [tam];
        
        for(int i=0;i<tam;i++){
            
            System.out.println("Dato"+i+"Vector 1");
            vector1 [i]= lec.nextInt();
            System.out.println("Dato"+i+"Vector 2");
            vector2 [i]= lec.nextInt();
        }

        int [] resultado=addition( vector1, vector2);
        
        for(int i=0;i<tam;i++){
            
            System.out.println("Dato"+i+"Vector Suma");
            System.out.println(resultado[i]);
        } 
}
}