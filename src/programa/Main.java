package programa;
import Logica.ListaNaves;
import Logica.Sistema;
import Logica.TiposDeMision;
import Logica.TiposDeNave;
import TiposDeNaves.Cargueros;
import TiposDeNaves.CrucerosEstelares;
import TiposDeNaves.NaveExploracion;
import java.util.Scanner;

// cosas por hacer:
// comprobaciones de inputs tanto como de enteros como de escritos
// manejo de errores mirar clase grabada o mirar ppt
// arreglar funcion explorar que se sobreescribe =????
//  podria crear algun tipo de variable boolean que tenga como objetivo saber si esta
//  en viaje o explorando o no, y que compruebe el año en el que el usuario ingreso que 
//  se realizaria el lanzamiento de la nave y que no quede en discordia con el hecho de que 
//  quiere que explore ahora, o darle la opcion decambiar la fecha de lanzamiento????? mucho laburo!!!!! fin de semana.


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Sistema ss = new Sistema();
        ListaNaves ln = new ListaNaves();
        
        boolean corriendo = true;
        
        do{
            try{
                System.out.println(" --- Menú ---"
                            + "\n 1. Agregar nave"
                            + "\n 2. Eliminar nave"
                            + "\n 3. Mostrar naves"
                            + "\n 4. Iniciar exploracion"
                            + "\n 5. Salir");

                int opcion = Integer.parseInt(sc.nextLine());

                if (!(opcion == 1||opcion == 2||opcion == 3||opcion == 4 || opcion == 5)){
                    System.out.println("Opcion no valida, ingrese un numero adecuado.");
                }
                
                switch (opcion){
                case 1 -> {
                    
                    System.out.println("Ingrese Tipo de Nave: ");
                    String tipo = sc.nextLine();
                    int tipoIngresadoNave = ss.inputTipoNave(tipo);
                    //buscar manera de que se pueda ingresar nombres espaciados.
                    
                    if (tipoIngresadoNave == 0){  
                        System.out.println("El tipo de nave que ingreso no coincide con el tipo que administramos. Pruebe de nuevo.");
                    }else{

                        System.out.println("Ingrese nombre: ");
                        String nombre = sc.nextLine();
                        
                        if (ln.comprobacionRepetidoNombre(nombre)){
                            System.out.println("Nombre ya utilizado, eliga otro");
                            continue;
                        }
                        
                        System.out.println("Ingrese año de lanzamiento: ");
                        int año = Integer.parseInt(sc.nextLine());
                        
                        //funcion que compare años y  no deje ingresar uno de antes de la fecha de hoy y no se exceda de los 3000 años (para mas realismo pa)
                        
                        System.out.println("Ingrese capacidad de tripulacion: ");
                        int capacidadT = Integer.parseInt(sc.nextLine());
                        
                        switch (tipoIngresadoNave){
                            case 1 -> {
                                //nave exploracion
                                try{
                                    System.out.println("Ingrese el tipo de mision que desea: "
                                                    + "\n1. Cartografia"
                                                    + "\n2. Investigacion"
                                                    + "\n3. Contacto");
                                    
                                    int tipoDeMisionInput = Integer.parseInt(sc.nextLine());
                                    // agregar comprobacion de input no solo con enteros sino con palabras
                                    if (tipoDeMisionInput == 1){
                                        NaveExploracion ne = new NaveExploracion(nombre, capacidadT, año, TiposDeNave.naveExploracion, TiposDeMision.CARTOGRAFIA);
                                        ln.agregarNave(ne);
                                    }else if(tipoDeMisionInput == 2){
                                        NaveExploracion ne = new NaveExploracion(nombre, capacidadT, año, TiposDeNave.naveExploracion, TiposDeMision.INVESTIGACION);
                                        ln.agregarNave(ne);
                                    }else if (tipoDeMisionInput == 3){
                                        NaveExploracion ne = new NaveExploracion(nombre, capacidadT, año, TiposDeNave.naveExploracion, TiposDeMision.CONTACTO);
                                        ln.agregarNave(ne);
                                    }else{
                                        System.out.println("Ingrese un numero admisible puestas en la cantidad de misiones (1, 2 o 3)");
                                    }
                                }catch(NumberFormatException e){
                                        System.out.println("Ingrese un numero admisible puestas en la cantidad de misiones (1, 2 o 3)");                                
                                }
                            }
                            case 2 -> {
                                //cargueros
                                try{
                                    System.out.println("Ingrese cuantas toneladas es capaz de cargar (100min - 500max): ");
                                    int cantToneladasInput = sc.nextInt();
                                    if (cantToneladasInput <= 500 && cantToneladasInput >= 100){
                                        Cargueros carguero = new Cargueros(nombre, capacidadT, año, TiposDeNave.cargueros, cantToneladasInput);
                                        ln.agregarNave(carguero);
                                        break;
                                    }else{
                                        System.out.println("Debe ingresar una cantidad de toneladas admisible...");
                                    }
                                }catch(Exception e){
                                    System.out.println("Debe de ingresar una cantidad numerica de toneladas.");
                                }
                            }
                            case 3 -> {
                                //cruceros estelares
                                try{
                                    System.out.println("Ingrese el limite de pasajeros que puede haber: ");
                                    int cantPasajeros = Integer.parseInt(sc.nextLine());
                                    CrucerosEstelares ce = new CrucerosEstelares(nombre, capacidadT, año, TiposDeNave.crucerosEstelares, cantPasajeros);
                                    ln.agregarNave(ce);
                                }catch(NumberFormatException e){
                                    System.out.println("Ingrese un numero.");
                                }
                                }
                                }
                    }
                    break; 
                }
                case 2 -> {
                    try{
                        System.out.println("Ingrese el nombre de la nave que quiere eliminar: ");
                        String nombreEliminado = sc.nextLine();
                        boolean naveEliminada = ln.eliminarNavePorNombre(nombreEliminado);

                        if (naveEliminada == false){
                            System.out.println("La nave '" + nombreEliminado + "' no pudo ser eliminada, intente de nuevo.");
                        }else{
                            System.out.println("El "+ nombreEliminado + " fue eliminado.");
                        }
                        break;
                    }catch(Exception e){
                        System.out.println("Ingrese un nombre.");
                    }
                    
                }
                
                case 3 -> {
                    ln.mostrarNaves();
                    break;
                }
                
                case 4 -> {
                    try{
                        System.out.println("¿Que nave quiere que realice exploracion? (ingrese nombre): ");
                        String nombreExploraracion = sc.nextLine();
                        TiposDeNave tipoNaveIngresada = ln.tipoDeNave(nombreExploraracion);
                        if (tipoNaveIngresada.equals(TiposDeNave.cargueros)){
                        }else if(tipoNaveIngresada.equals(TiposDeNave.crucerosEstelares)){
                        }else if(tipoNaveIngresada.equals(TiposDeNave.naveExploracion)){
                        }else{
                            System.out.println("No se ha encontrado, intente de nuevo.");
                        }
                    }catch(Exception e){
                    
                    }
                    break;
                }
                
                case 5 -> {
                    System.out.println("Saliendo del sistema...");
                    corriendo = false;
                    break;
                }
                }    
            }catch(NumberFormatException e){
                System.out.println("Ingrese un numero (1, 2, 3, 4 o 5)");
            }
        }while(corriendo == true);
    }
}

