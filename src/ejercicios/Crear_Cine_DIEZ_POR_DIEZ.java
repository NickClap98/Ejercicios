
package ejercicios;
import java.util.Scanner;
/**
 *
 * @author Nick
 */
public class Crear_Cine_DIEZ_POR_DIEZ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [][] capacidad = new char[10][10];
        for (byte i = 0; i < 10; i++) {
            for(byte l = 0; l<10; l++){
            capacidad[i][l] = 'L';
            
            }
        }
       int respuesta = 0;
        System.out.println("**********************************");
        System.out.println("*Bienvenido al sistema de ventas!*");
        System.out.println("**********************************");
        byte ciclo = 0;
        while (ciclo == 0){
            try {
                
           
       System.out.println("\n Que desea hacer?" + "\n 1.Reservar" + "\n 2.Ver Disponibles"
        + "\n 3.Salir");
        respuesta = sc.nextInt();
        if(respuesta == 1){
            System.out.println("Escriba una fila del 0-9");
            int fila = sc.nextInt();
            System.out.println("Escriba una columna del 0-9");
            int columna = sc.nextInt();
           
            
            
           
            if(capacidad[fila][columna] == 'L'){
                capacidad[fila][columna] = 'X';
                System.out.println("Asiento Reservado Correctamente");
            }
        } if(respuesta == 2){
        Crear_Cine_DIEZ_POR_DIEZ.MostrarAsientos(capacidad);
        }
        if (respuesta == 3){
            System.out.println("Saliste Exitosamente");
        ciclo = 2;
        }
        }
        //Catch
         catch (Exception e) { System.out.println("Error Al reservar");
            }
            if(respuesta >=4){
                System.out.println("Error Elegir una opcion Correcta!");}
        }// TODO code application logic here
    }
    public static void MostrarAsientos(char Cine[][]){
        System.out.println("Columna: 0**1**2**3**4**5**6**7**8**9");
        for(byte f = 0; f <10 ; f++){
        System.out.print("Fila: " + f + " ");
     
   
    for(byte c = 0; c<10; c++){
    
        System.out.print( "["+Cine[f][c]+"]");
    }
        System.out.println("");
    }
    }
}
