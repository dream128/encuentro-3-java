package encuentro3;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args){
   Scanner leer = new Scanner(System.in);
        System.out.println("dispositivo RS232");
        System.out.println("las cadenas deven tener el formato de 5 caracteres");
        System.out.println("empezando con X y terminando en O se tomaran como válidas");
        System.out.println("la cadena especial para terminar el envio es &&&&&");
        String cadena;
        int x;
        
        do{
            System.out.println("ingrese las cadenas...");
            cadena = leer.nextLine();
            x = cadena.length();
            if(x<5){
                
            }
            
        }while(x>4);
   
    }
}