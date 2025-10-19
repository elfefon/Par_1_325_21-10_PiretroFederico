package Logica;

import java.util.Scanner;

public class Sistema{
  
    //manejo y simplificacion de input
                        
    public int inputTipoNave(String tipo){
        
        String input = tipo.toLowerCase();
        
        if (input.contains("exploracion")){
            return 1;
        }else if (input.contains("carguero")){
            return 2;
        }else if (input.contains("crucero estelar")){
            return 3;
        }else {
            return 0;
        }
    }
    
    public String ingresoNombre(Scanner sc){
        boolean corriendo = true;
        do{
            try{
                System.out.println("Ingrese nombre: ");
                String nombre = sc.nextLine();
                corriendo = false;
                return nombre;
            }catch(Exception e){
                System.out.println("Ingrese un nombre");
            }
        }while(corriendo == true);
        return null;
    }
    
    public int ingresoAño(Scanner sc){
        boolean corriendo = true;
        do{
            try{
                System.out.println("Ingrese año de lanzamiento: ");
                int año = Integer.parseInt(sc.nextLine());
                corriendo = false;
                return año;
            }catch(NumberFormatException e){
                System.out.println("Ingrese un año numerico.");
            }
        }while(corriendo == true);
        return 0;
    }
    
    public int ingresoCapacidadTripulacion(Scanner sc){
        boolean corriendo = true;
        do{
            try{
                System.out.println("Ingrese capacidad de tripulacion: ");
                int capacidadT = Integer.parseInt(sc.nextLine());
                corriendo = false;
                return capacidadT;
            }catch(NumberFormatException e){
                System.out.println("Ingrese un numero.");
            }
        }while(corriendo == true);
        return 0;
    }
    
    
    
}
