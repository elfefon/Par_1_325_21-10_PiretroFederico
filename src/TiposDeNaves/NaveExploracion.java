package TiposDeNaves;

import Logica.Exploracion;
import Logica.TiposDeMision;

public class NaveExploracion extends Nave implements Exploracion {
    
    private TiposDeMision tipoDeMision;

    public NaveExploracion(String nombre, int capacidadDeTripulación, int añoDeLanzamiento, TiposDeMision tipoDeMision) {
        super(nombre, capacidadDeTripulación, añoDeLanzamiento);
        this.tipoDeMision = tipoDeMision;
    }

    @Override
    public void explorar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "NaveExploracion{" + "tipoDeMision=" + tipoDeMision + '}';
    }
    
    
    
    }
    

