/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipctarea3;

import java.util.Scanner;

/**
 *
 * @author Majus
 */
public class Palindromo {
    
    private static Scanner sc = new Scanner(System.in);
    private static String palabra = "";
    
    static void Palindromo(){
        //mostrar menu y leer palabra
        menu();
        String result = palindroma();
        System.out.println(result);
    }
    
    static void menu(){
        System.out.println("");        
        System.out.println("Palabras Palindromas");
        System.out.println("");
        System.out.println("Ingresar Palabra");
        palabra = sc.nextLine();
    }
    
    static String palindroma(){

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
