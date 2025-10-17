package TiposDeNaves;

import Logica.Exploracion;
import Logica.TiposDeMision;
import Logica.TiposDeNave;

public class NaveExploracion extends Nave implements Exploracion {
    
    private TiposDeMision tipoDeMision;

    public NaveExploracion(String nombre, int capacidadDeTripulación, int añoDeLanzamiento,TiposDeNave tipoNave, TiposDeMision tipoDeMision) {
        super(nombre, capacidadDeTripulación, añoDeLanzamiento, tipoNave);
        this.tipoDeMision = tipoDeMision;
    }

    @Override
    public void explorar() {
        System.out.println("Se ha iniciado la exploracion.");
    }

    @Override
    public void iniciarMision() {
        this.explorar();
    }
    
    
    
    @Override
    public String toString() {
        return "nave :" + tipoNave + " | nombre: " + nombre + " | año de lanzamiento: " 
                + añoDeLanzamiento + " | Capacidad de tripulacion: " + capacidadDeTripulación
                +" | tipo de mision: " + tipoDeMision;
    }
    
    
    
    }
    

