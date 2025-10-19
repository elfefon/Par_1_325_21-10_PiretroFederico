package TiposDeNaves;

import Logica.Exploracion;
import Logica.TiposDeNave;

public class CrucerosEstelares extends Nave implements Exploracion{ 
    
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
    
    @Override
    public void iniciarMision() {
        this.explorar();
    }

    @Override
    public void explorar() {
        System.out.println("Los cruceros estelares no pueden iniciar exploraciones debido a que llevan pasajeros.");
    }
    
    
    
}
