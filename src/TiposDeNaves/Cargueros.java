package TiposDeNaves;

import Logica.Exploracion;

public class Cargueros extends Nave implements Exploracion {
    
    private int capacidadDeCarga; // de 100 hasta 500 toneladas.
    
    public Cargueros(String nombre, int capacidadDeTripulación, int añoDeLanzamiento, int capacidadDeCarga) {
        super(nombre, capacidadDeTripulación, añoDeLanzamiento);
        this.capacidadDeCarga = capacidadDeCarga;
    }

    @Override
    public void explorar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    
}
