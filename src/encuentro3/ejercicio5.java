package encuentro3;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args){
   Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero limite");
        int num,suma,aux;
        num = leer.nextInt();
        suma=0;
        System.out.println("ingrese numeros a sumar");
        while(suma<num){
            aux = leer.nextInt();
            suma = suma+aux;
            System.out.println("ingreso " + aux);
            System.out.println("el total es:" + suma);
        }
            
    }
}