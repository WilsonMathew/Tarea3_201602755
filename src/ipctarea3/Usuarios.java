/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipctarea3;
import static ipctarea3.Consola.menu;
import java.util.Scanner;

/**
 *
 * @author Majus
 */
public class Usuarios {
 
    private static int opcion;
    private static Consola cl = new Consola();
    private static Scanner sc = new Scanner(System.in);
    
    
    private static int n = 5;
    private static String usuarios[] = new String[n];
    private static Scanner us = new Scanner(System.in);

    static void Usuarios(){
        menuF();
    }
    // menu Usuarios funcional
    public static void menuF(){

        do{

        menu();
            
            switch(opcion){
            case 1:
                opcion = 5;
                System.out.flush();
                inUsuarios();
                break;
            case 2:
                opcion = 5;
                System.out.flush();
                showUsuarios();               
                break;
            case 3:
                opcion = 5;
                System.out.flush();
                perUsuario();
                break;
            case 4:
                opcion = 5;
                System.out.flush();
                cl.menuF();
                break;
            case 5:
                break;
            default:
                System.out.flush();
                System.out.println("Usten escojio: " + opcion + " Opcion invalida, elija del 1 al 3");
                System.out.println(" ");
                break;
            }
            
        }while(opcion != 5);
    }
    // Texto del menu
    public static void menu(){
            
        System.out.println("    Menu de Usuarios");
        System.out.println("");
        System.out.println("1. Ingresar Usuarios");
        System.out.println("2. Mostrar todos los Usuarios");        
        System.out.println("3. Mostrar un Usuario Personalizado");
        System.out.println("4. Menu Principal");
        System.out.println("5. Salir");
        opcion = sc.nextInt();
    }
    
    
    // opcion 1 del menu
    public static void inUsuarios(){
        
        for(int i = 0; i < usuarios.length ; i++){            
            System.out.println("Ingrese usuario " + (i+1));
            usuarios[i] = us.nextLine();
        }
        
        menuF();
    }
    
    // opcion 2 del menu
    public static void showUsuarios(){
        
        System.out.println("");         
        System.out.println("Mostrar todos los Usuarios");       
        
        for(int i = 0; i < usuarios.length; i++ ){
            System.out.println("    "+(i+1) + ". " + usuarios[i]);
        }
        
        System.out.println("");
        menuF();
    }
    
    public static void perUsuario(){
        
        String buscar = "";
        
        System.out.println("Mostrar un Uusuario Personalizado");
        System.out.println("    Ingrese Uusario");        
        buscar = us.nextLine();
        boolean flag = false;
        
        buscar = buscar.toLowerCase();
        buscar = buscar.replaceAll("\\s","");
        
        for(int i =0; i< usuarios.length; i++){
            usuarios[i] = usuarios[i].toLowerCase();
            usuarios[i] = usuarios[i].replaceAll("\\s","");
            
            if(buscar.compareTo(usuarios[i]) == 0){
                System.out.println(usuarios[i]);
                flag = true;
            }
        }
    
        if(!flag){
            System.out.println("ERROR! No existe ningun usuario con esa coincodemcia");
        }
        
        menuF();
    }
        
}
