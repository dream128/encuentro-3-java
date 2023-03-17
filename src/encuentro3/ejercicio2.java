package encuentro3;

import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
     Scanner leer = new Scanner(System.in);
     String frase2 = new String("eureka");
     String frase;
        System.out.println("escriba una frase");
        frase = leer.nextLine();
        if(frase.equals(frase2)){
            System.out.println("correcto");
            
        }else
            System.out.println("incorrecto");
    }

}
