package encuentro3;

import java.util.Scanner;

public class ejercicio1 {
    public static void main(String[] args) {
        int num;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        num = leer.nextInt();
        if(num%2==0){
            System.out.println("el numero es par");
        }else{
            System.out.println("el numero es impar");
        }
    }

}
