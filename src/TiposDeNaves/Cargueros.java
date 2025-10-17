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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "nave :" + tipoNave + " | nombre: " + nombre + " | año de lanzamiento: " 
                + añoDeLanzamiento + " | Capacidad de tripulacion: " + capacidadDeTripulación
                + " | Capacidad de carga: " + capacidadDeCarga;

    }
    
    
    
    
}
