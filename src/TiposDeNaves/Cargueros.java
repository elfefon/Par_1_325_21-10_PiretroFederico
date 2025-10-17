package TiposDeNaves;

import Logica.Exploracion;
import Logica.TiposDeNave;

public class Cargueros extends Nave implements Exploracion {
    
    private int capacidadDeCarga; // de 100 hasta 500 toneladas.
    
    public Cargueros(String nombre, int capacidadDeTripulación, int añoDeLanzamiento,TiposDeNave tipoNave, int capacidadDeCarga) {
        super(nombre, capacidadDeTripulación, añoDeLanzamiento,tipoNave);
        this.capacidadDeCarga = capacidadDeCarga;
    }

    @Override
    public void explorar() {
        System.out.println("Se ha iniciado la mision del carguero");
    }
    
    @Override
    public void iniciarMision() {
        this.explorar();
    }
    
    @Override
    public String toString() {
        return "nave :" + tipoNave + " | nombre: " + nombre + " | año de lanzamiento: " 
                + añoDeLanzamiento + " | Capacidad de tripulacion: " + capacidadDeTripulación
                + " | Capacidad de carga: " + capacidadDeCarga;

    }
    
    
    
    
}
