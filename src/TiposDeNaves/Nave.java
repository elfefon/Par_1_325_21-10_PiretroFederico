package TiposDeNaves;

import Logica.TiposDeNave;

public class Nave {
    
    //inicializacion de variables
    protected String nombre;
    protected int capacidadDeTripulación;
    protected int añoDeLanzamiento;
    protected TiposDeNave tipoNave;

    public Nave(String nombre, int capacidadDeTripulación, int añoDeLanzamiento, TiposDeNave tipoNave) {
        this.nombre = nombre;
        this.capacidadDeTripulación = capacidadDeTripulación;
        this.añoDeLanzamiento = añoDeLanzamiento;
        this.tipoNave = tipoNave;
    }

    @Override
    public String toString() {
        return "Nave{" + "nombre=" + nombre + ", capacidadDeTripulación=" + capacidadDeTripulación + ", añoDeLanzamiento=" + añoDeLanzamiento + ", tipoNave=" + tipoNave + '}';
    }

    public String getNombre() {
        return nombre;
    }

    public int getCapacidadDeTripulación() {
        return capacidadDeTripulación;
    }

    public int getAñoDeLanzamiento() {
        return añoDeLanzamiento;
    }

    public TiposDeNave getTipoNave() {
        return tipoNave;
    }
    
    
    
    
}
