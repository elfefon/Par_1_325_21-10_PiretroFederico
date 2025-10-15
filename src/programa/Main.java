package programa;
import Logica.ListaNaves;
import Logica.Sistema;
import Logica.TiposDeMision;
import TiposDeNaves.Cargueros;
import TiposDeNaves.CrucerosEstelares;
import TiposDeNaves.Nave;
import TiposDeNaves.NaveExploracion;
import java.util.Scanner;

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

            switch (opcion){
                case 1 -> {
                    do{

                        System.out.println("Ingrese Tipo de Nave: ");
                        String tipo = sc.nextLine();
                        int tipoIngresadoNave = ss.inputTipoNave(tipo);

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
                                    
                                    if (tipoDeMisionInput == 1){
                                        NaveExploracion ne = new NaveExploracion(nombre, capacidadT, año, TiposDeMision.CARTOGRAFIA);
                                        ln.agregarNave(ne);
                                    }else if(tipoDeMisionInput == 2){
                                        NaveExploracion ne = new NaveExploracion(nombre, capacidadT, año, TiposDeMision.INVESTIGACION);
                                        ln.agregarNave(ne);
                                    }else if (tipoDeMisionInput == 3){
                                        NaveExploracion ne = new NaveExploracion(nombre, capacidadT, año, TiposDeMision.CONTACTO);
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
                                        if (cantToneladasInput <= 500 && cantToneladasInput >= 100){
                                            Cargueros carguero = new Cargueros(nombre, capacidadT, año, cantToneladasInput);
                                            ln.agregarNave(carguero);
                                            break;
                                        }else{
                                            System.out.println("Vuelva a ingresar una cantidad de toneladas admisible...");
                                        }
                                    }while(true);
                                }
                                case 3 -> {
                                    //cruceros estelares
                                    System.out.println("Ingrese el limite de pasajeros que puede haber: ");
                                    int cantPasajeros = sc.nextInt();
                                    sc.nextLine();
                                    CrucerosEstelares ce = new CrucerosEstelares(nombre, capacidadT, año, cantPasajeros);
                                    }
                                    }
                                    
                        }
                    }while(true);
                    
                    //break;  !!!!!!!!!!
                }
                
                case 2 -> {
                    System.out.println("hola");
                    break;
                }
            
            }
        }while(true);
    }
}

