package tienda;

import java.util.Scanner;

/**
 * @author Julio C. Martelo
 */

public class Tienda {
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        System.out.println("             Tienda\n");
        System.out.println("(1) Registrar compra");
        System.out.println("(0) Salir\n");
        Scanner entrada = new Scanner(System.in);
        int opcion =  entrada.nextInt();
        System.out.println(opcion);
        //MENU DE OPCIONES ->
    }
    
    public static void rc(){ // Registrar compra
        // bla bla bla
    }
    
}
