package ipctarea3;
import java.util.Scanner;

/**
 *
 * @author Gaspar Wilson Laynez Mateo
 */

public class Palindromo {
    
    // var para recibir opcion en menu
    private static Scanner sc = new Scanner(System.in);
    private static String palabra = "";
    
    // cons para llamar metodso y verificar si palabra es palindrome
    public static void Palindromo(){
        
        Consola cl1 = new Consola();

        //mostrar menu y leer palabra
        menu();
        String result = palindroma();
        System.out.println(result);
        System.out.println("");

        Consola.menuF();
    }
    
    // Texto del menu
    public static void menu(){
        System.out.println("");        
        System.out.println("Palabras Palindromas");
        System.out.println("");
        System.out.println("Ingresar Palabra");
        palabra = sc.nextLine();
    }
    
    // Metodo verifica si palabra es palindromo o no
    // Regresa un mensaje indicandolo
    public static String palindroma(){


        // return
        String msg = "Ingres Palabra";
        
        String palEsp= palabra;
        String palSin= "";
        
        // var revez
        String pal = "";
        int mayor = palabra.length()-1; 
        
        // Palabra al revez
        for(int i=palabra.length();i>0;i--){    
        pal = pal + palabra.charAt(mayor--);
        }
        
        // var de todo a minusculas
        String pal1 = palabra.toLowerCase();
        String pal2 = pal.toLowerCase();
        
        pal1 = pal1.replaceAll("\\s","");
        pal2 = pal2.replaceAll("\\s","");
        
        if(pal1.compareTo(pal2) ==0) {
            msg = "SI ES PALINDROMA!!!!!";
        }else{
            msg = " NO ES PALINDROMA!!!!!";
        }
        return msg;
    }
}
