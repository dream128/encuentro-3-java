package encuentro3;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        String f;
       int t;
       Scanner le = new Scanner(System.in); 
       
        System.out.println("escriba una frase");
        f = le.nextLine();
        t=f.length();
        System.out.println(t);
        if(t==8){
            System.out.println("correcto");
        }else{
            System.out.println("incorrecto");
        }
    }
}
