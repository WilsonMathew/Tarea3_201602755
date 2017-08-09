package ipctarea3;
import java.util.Scanner;


/**
 *
 * @author Gaspar Wilson Laynez Mateo
 */
public class Consola {
    
    // Opciones para manipular el menu
    private static int opcion;
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        // TODO code application logic here
        menuF();
    }
        
    // Menu Funcional
    public static void menuF(){
        
        // OPcioens para dirigirse al menu Uusuarios y palindromo
        Usuarios us = new Usuarios();
        Palindromo pl = new Palindromo();
        
    // Menu principal
        do{

        menu();
            
            switch(opcion){
            case 1:
                opcion = 3;
                System.out.flush();
                us.Usuarios();
                break;
            case 2:
                opcion = 3;
                System.out.flush();
                pl.Palindromo();
                break;
            case 3:
                break;
            default:
                System.out.flush();
                System.out.println();
                System.out.println("Usten escojio: " + opcion + " Opcion invalida, elija del 1 al 3");
                System.out.println(" ");
            break;
            }
            
        }while(opcion != 3);
            
    }
        // Text Menu
    public static void menu(){
            
        System.out.println("    Tarea 3");
        System.out.println("");
        System.out.println("    201602755");
        System.out.println("");
        System.out.println("1. Usuarios");
        System.out.println("2. Palabras Palindromas");
        System.out.println("3. Salir");
        opcion = sc.nextInt();
    }   
}
