package encuentro3;

import java.util.Scanner;

public class ejercicio4 {
     public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
         System.out.println("esccriba una frase");
         String frase;
         frase = leer.nextLine();
         frase = frase.substring(0,1);
       if(frase.equals("a")){
            System.out.println("correcto");
       }else{
           System.out.println("incorrecto");
       }
              
    }
}

   