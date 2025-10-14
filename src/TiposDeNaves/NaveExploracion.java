package TiposDeNaves;

import Logica.Exploracion;

public class NaveExploracion extends Nave implements Exploracion {
    
    private String tipoDeMision;

    public NaveExploracion(String nombre, int capacidadDeTripulación, int añoDeLanzamiento, String tipoDeMision) {
        super(nombre, capacidadDeTripulación, añoDeLanzamiento);
        this.tipoDeMision = tipoDeMision;
    }

    @Override
    public void explorar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    }
    

