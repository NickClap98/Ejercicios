
package ejercicios;
import java.util.Scanner;
public class Calculadora {
 
    public static void main(String[] args) {
     int respuesta =0;
    boolean verificacion = false;
    double numero1;
    double numero2;
     Scanner sc = new Scanner(System.in);
    
        System.out.println("*****************************");
        System.out.println("*BIENVENIDO A LA CALCULADORA*");
        System.out.println("*****************************");
     
       
  
    while(verificacion == false){
    try{
      
        System.out.println("Que operacion desea hacer?"+ "\n 1.Sumar \n 2.Restar \n "
                + "3.Multiplicar \n 4.Dividir" + "\n 5.SALIR o otro numero");
     respuesta = sc.nextInt();
    if (respuesta >=6){System.exit(0);}
        System.out.print("Elije el primer numero: ");
        numero1 = sc.nextDouble();
        System.out.print("Elije el segundo numero: ");
        numero2 = sc.nextDouble();
        //SI ELEGIS NUMEROS ENTEROS
        if (respuesta == 1){ System.out.println("La respuesta es: "+ Calculadora.Sumar(numero1, numero2));}
        else if(respuesta == 2){System.out.println("La respuesta es: "+ Calculadora.Restar(numero1, numero2));}
       else if(respuesta == 3){System.out.println("La respuesta es: "+ Calculadora.Multiplicar(numero1, numero2));}
   else if(respuesta == 4){System.out.println("La respuesta es: "+ Calculadora.Dividir(numero1, numero2));}
else if(respuesta == 5){System.out.println("La respuesta es: "+ Calculadora.Dividir(numero1, numero2));
verificacion = true;
}
else {System.out.println("HA OCURRIDO UN ERROR, INTENTE NUEVAMENTE");}
    
    } catch (Exception e){}
    }    
    }
    public static double Sumar(double numero1, double numero2){
    double resultado;
   resultado = numero1 + numero2;
    return resultado;}
    
     public static double Restar(double numero1, double numero2){
  double resultado;
    resultado = numero1 - numero2;
    
    return resultado;}
    public static double Multiplicar(double numero1, double numero2){
  double resultado;
    resultado = numero1 * numero2;
    
    return resultado;}
     public static double Dividir(double numero1, double numero2){
    double resultado;
    resultado = numero1 / numero2;
    return resultado;}
    
    
   
    
    
    
    }
