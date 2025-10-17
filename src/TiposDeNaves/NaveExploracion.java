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
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "nave :" + tipoNave + " | nombre: " + nombre + " | año de lanzamiento: " 
                + añoDeLanzamiento + " | Capacidad de tripulacion: " + capacidadDeTripulación
                +" | tipo de mision: " + tipoDeMision;
    }
    
    
    
    }
    

