package TiposDeNaves;

import Logica.TiposDeNave;

public class CrucerosEstelares extends Nave{ 
    
    private int CantidadPasajeros;

    public CrucerosEstelares(String nombre, int capacidadDeTripulación, int añoDeLanzamiento,TiposDeNave tipoNave , int cantPasajeros) {
        super(nombre, capacidadDeTripulación, añoDeLanzamiento, tipoNave);
        this.CantidadPasajeros = cantPasajeros;
    }

    @Override
    public String toString() {
        return "nave :" + tipoNave + " | nombre: " + nombre + " | año de lanzamiento: " 
                + añoDeLanzamiento + " | Capacidad de tripulacion: " + capacidadDeTripulación
                + " | cantidad de pasajeros: " + CantidadPasajeros;
    }
    
    
    
}
