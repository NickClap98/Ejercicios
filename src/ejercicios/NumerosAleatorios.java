
package ejercicios;

import java.util.Random;

/**
 *
 * @author Nick
 */

public class NumerosAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          int[] Arreglo= new int[100]; //Arreglo de 100 numeros 
        int indice=0; //indice se mueve en el arreglo
        int NumeroRandom; // NumeroRandom es a quien le vamos a pasar UN RANDOM()
        Random r = new Random();
        
        while(indice<99){ //REPITE EL CICLO HASTA QUE INDICE SEA 98
        NumeroRandom = r.nextInt(100)+1; //LE ASIGNA UN INT RANDOM
        if(!a(Arreglo,NumeroRandom,indice)){//SI EL METODO DE ARREGLO DEVUELVE FALSE
        Arreglo[indice] =NumeroRandom;     //ENTONCES ARREGLO EN EL INDICE PONELE UN RANDOM
        indice++;                          //AUMENTA INDICE
        }
        
        }
        for (int j = 0; j <Arreglo.length; j++) { //SI J es 0 devolveme LO QUE HAY EN
                                                  //PRIMERA POCISION EN ARREGLO INDICE
            System.out.print(Arreglo[j]+" "); //DIBUJALO
            
        }
        
    }
    
    //METODO PARA COMPROBAR LA BUSQUEDA
    public static boolean a(int [] Arreglo,int NumeroRandom, int indice){
        int j;
        for (j = 0;  j<indice; j++) {  //SI J ES MENOR AL INDICE REPETI QUE
            if(NumeroRandom == Arreglo[j]){ //Y NUMERO RANDOM ES EL MISMO QUE J
            return true; //DEVOLVEME VERDADERO
            }
        }
 return false;   }
}     