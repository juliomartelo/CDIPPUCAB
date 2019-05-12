package inventario;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * @author Julio C. Martelo
 */

public class Inventario {
    
    public static void main(String[] args) {
        menu();
        lpe();
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
        File file = new File("C:\\Users\\Julio\\Documents\\GitHub\\CDIPPUCAB\\Procesos\\Archivos\\archivo1.txt");
        System.out.println(file.exists()); // Verifica si existe el archivo
        if (!file.exists()){  // Verifica si existe el archivo
            try{
                file.createNewFile();
                System.out.println(file.getName()+ " ha sido creado");
            }catch(IOException ex){ ex.printStackTrace();}
        }
        try {
            FileReader entrada=new FileReader("C:\\Users\\Julio\\Documents\\GitHub\\CDIPPUCAB\\Procesos\\Archivos\\archivo1.txt");
            int c =  entrada.read();
            if (c != -1){
                System.out.print((char)c);
                while(c != -1){
                    c=entrada.read();
                    char letra=(char)c;
                    System.out.print(letra);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public static void cpe(){ // CARGAR PRODUCTOS DE LA EMPRESA
        // ESTA FUNCION DEBERÁ LEER DE UN ARCHIVO DE TEXTO PLANO
        // QUE CONTENDRA LA SIGUIENTE ESTRUCTURA <CODPRODUCTO>#<CANTIDAD>
        //POR LINEA Y ME IMAGINO QUE GUARDARLO EN UNA LISTA QUE LA FUNCION
        //LPE() DEBE MOSTRAR LO QUE SE LEA.
    }
    
    public static void adpe(){ //ACTUALIZAR DISPONIBILIDAD DE PRODUCTOS
    
    }
    
/*   public static void archivos(){
        File file = new File("C:\\Users\\Julio\\Documents\\GitHub\\CDIPPUCAB\\Procesos\\Archivos\\archivo1.txt");
        System.out.println(file.exists()); // Verifica si existe el archivo
        if (!file.exists()){  // Verifica si existe el archivo
            try{
                file.createNewFile();
                System.out.println(file.getName()+ " ha sido creado");
            }catch(IOException ex){ ex.printStackTrace();}
        }
    }*/
    
/* public static void leerarchivo(){
        try {
            FileReader entrada=new FileReader("C:\\Users\\Julio\\Documents\\GitHub\\CDIPPUCAB\\Procesos\\Archivos\\archivo1.txt");
            int c =  entrada.read();
            if (c != -1){
                System.out.print((char)c);
                while(c != -1){
                    c=entrada.read();
                    char letra=(char)c;
                    System.out.print(letra);
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(Inventario.class.getName()).log(Level.SEVERE, null, ex);
        }
    } */
    
}
