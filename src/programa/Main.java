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
        
        do{
            System.out.println(" --- Menú ---"
                        + "\n 1. Agregar nave"
                        + "\n 2. Eliminar nave"
                        + "\n 3. Mostrar naves"
                        + "\n 4. Salir");
            
            int opcion = sc.nextInt();
            sc.nextLine();
            
            // agregar comprobacion de input no solo con enteros sino con palabras
            
            if (!(opcion == 1|opcion == 2|opcion == 3|opcion == 4)){
                
            }
            
            switch (opcion){
                case 1 -> {
                    
                    System.out.println("Ingrese Tipo de Nave: ");
                    String tipo = sc.nextLine();
                    int tipoIngresadoNave = ss.inputTipoNave(tipo);
                    // agregar comprobacion de input no solo con enteros sino con palabras
                    if (tipoIngresadoNave == 0){
                        //manejo de errores
                        System.out.println("El tipo de nave que ingreso no coincide con el tipo que administramos. Pruebe de nuevo.");
                    }else{

                        System.out.println("Ingrese nombre: ");
                        String nombre = sc.nextLine();
                        System.out.println("Ingrese capacidad de tripulacion: ");
                        int capacidadT = sc.nextInt();
                        sc.nextLine();
                        System.out.println("Ingrese año de lanzamiento: ");
                        int año = sc.nextInt();
                        sc.nextLine();

                        // manejo de errores. Comparacion por si quiere agregar una nave
                        // con el mismo nombre y/o año.
                        // (hay que hacerlo acá antes de los nuevos inputs)

                        switch (tipoIngresadoNave){
                            case 1 -> {
                                //nave Exploracion
                                System.out.println("Ingrese el tipo de mision que desea: "
                                                + "\n1. Cartografia"
                                                + "\n2. Investigacion"
                                                + "\n3. Contacto");

                                int tipoDeMisionInput = sc.nextInt();
                                sc.nextLine();
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
                            }
                            case 2 -> {
                                //cargueros
                                do{
                                    System.out.println("Ingrese cuantas toneladas es capaz de cargar (100min - 500max): ");
                                    int cantToneladasInput = sc.nextInt();
                                    sc.nextLine();
                                    //try??????????????????????? manejo de errores a revisar
                                    // agregar comprobacion de input no solo con enteros sino con palabras
                                    if (cantToneladasInput <= 500 && cantToneladasInput >= 100){
                                        Cargueros carguero = new Cargueros(nombre, capacidadT, año, TiposDeNave.cargueros, cantToneladasInput);
                                        ln.agregarNave(carguero);
                                        break;
                                    }else{
                                        System.out.println("Vuelva a ingresar una cantidad de toneladas admisible...");
                                    }
                                }while(true);
                            }
                            case 3 -> {
                                //cruceros estelares
                                // agregar comprobacion de input no solo con enteros sino con palabras
                                System.out.println("Ingrese el limite de pasajeros que puede haber: ");
                                int cantPasajeros = sc.nextInt();
                                sc.nextLine();
                                CrucerosEstelares ce = new CrucerosEstelares(nombre, capacidadT, año, TiposDeNave.crucerosEstelares, cantPasajeros);
                                ln.agregarNave(ce);
                                }
                                }
                    }
                    break; 
                }
                
                case 2 -> {
                    //agregar sistema que si ingresa algo que no coincida tire por consola que no existe nada
                    //comprobacion de que no ingrese un entero
                    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                    //!!!!!!!!!funcion que busque por nombre y que elimine?? o por id??? averiguar que es mejor!!!!!!!!!
                    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                    //
                    System.out.println("Ingrese el nombre de la nave que quiere eliminar: ");
                    String nombreEliminado = sc.nextLine();
                    ln.eliminarNavePorNombre(nombreEliminado);
                    System.out.println("El "+ nombreEliminado + " fue eliminado.");
                    break;
                }
                
                case 3 -> {
                    ln.mostrarNaves();
                    break;
                }
                
                case 4 -> {
                    break;
                }
                
            }
        }while(true);
    }
}

