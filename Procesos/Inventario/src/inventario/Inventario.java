package inventario;

import java.util.Scanner;

/*
 * @author Julio C. Martelo
 */

public class Inventario {
    
    public static void main(String[] args) {
        menu();
        // TODO code application logic here
    }
    
    public static void menu(){
        System.out.println("               Inventario");
        System.out.println("(1) Lista de productos de la empresa");
        System.out.println("(2) Cargar productos de la empresa");
        System.out.println("(3) Actualizar disponibilidad de los productos de la empresa");
        System.out.println("(0) Salir\n");
        System.out.print("Opcion: ");
        Scanner entrada = new Scanner(System.in);
        int opcion =  entrada.nextInt();
        System.out.println(opcion);
        
        //MENU DE OPCIONES ->
    }
    
    public static void lpe(){ // LISTA PRODUCTOS DE LA EMPRESA
        // ESTA FUNCION MOSTRARÁ UN LISTADO DE PRODUCTOS CON
        // LA SIGUIENTE ESTRUCUTRA <CODPRODUCTO>-<CANDIDAD>
    }
    
    public static void cpe(){ // CARGAR PRODUCTOS DE LA EMPRESA
        // ESTA FUNCION DEBERÁ LEER DE UN ARCHIVO DE TEXTO PLANO
        // QUE CONTENDRA LA SIGUIENTE ESTRUCTURA <CODPRODUCTO>#<CANTIDAD>
        //POR LINEA Y ME IMAGINO QUE GUARDARLO EN UNA LISTA QUE LA FUNCION
        //LPE() DEBE MOSTRAR LO QUE SE LEA.
    }
    
    public static void adpe(){ //ACTUALIZAR DISPONIBILIDAD DE PRODUCTOS
    
    }
    
}
