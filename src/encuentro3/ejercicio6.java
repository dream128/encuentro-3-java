package encuentro3;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args){
   Scanner leer = new Scanner(System.in);
   
   int num1,num2,num3,opcion;
   String con;
   boolean salir;
   salir = false;
        System.out.println("ingrese 2 numeros");
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        do{ 
            num3 = 0;
            System.out.println("=== MENU PRINCIPAL ===");
            System.out.println("1. SUMAR");
            System.out.println("2. RESTAR");
            System.out.println("3. MULTIPLICAR");
            System.out.println("4. DIVIDIR");
            System.out.println("5. SALIR");
            System.out.println("ingrese una opcion");
            opcion = leer.nextInt();
                switch(opcion){
                    case 1:
                        num3 = num1+num2;
                        System.out.println(num3);
                        break;
                    case 2:
                        num3 = num1-num2;
                        System.out.println(num3);
                        break;
                    case 3:
                        num3 = num1*num2;
                        System.out.println(num3);
                        break;
                    case 4:
                        num3 = num1/num2;
                        System.out.println(num3);
                        break;
                    case 5:
                        System.out.println("¿estas seguro de que deseas salir del programa? (S/N)");
                            con = leer.next();
                                if(con.equals("s")){
                                    salir = true;
                                }
                                    if(con.equals("n")){
                                        salir = false;
                                    }
                                      else{
                                            System.out.println("opcion invalida");
                                            salir = true;
                                        }
                        break;
                    default:
                        System.out.println("opcion no válida.");
                } 
                if (!salir){
                    System.out.println("presione una tecla para continuar...");
                    leer.nextLine();
                    leer.nextLine();
                }
        }while(!salir);  
        
    }
}