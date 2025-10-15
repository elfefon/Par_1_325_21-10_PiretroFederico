package TiposDeNaves;

public class Nave {
    
    //inicializacion de variables
    protected String nombre;
    protected int capacidadDeTripulación;
    protected int añoDeLanzamiento;

    public Nave(String nombre, int capacidadDeTripulación, int añoDeLanzamiento) {
        this.nombre = nombre;
        this.capacidadDeTripulación = capacidadDeTripulación;
        this.añoDeLanzamiento = añoDeLanzamiento;
    }

    @Override
    public String toString() {
        return "Nave{" + "nombre=" + nombre + ", capacidadDeTripulación=" + capacidadDeTripulación + ", añoDeLanzamiento=" + añoDeLanzamiento + '}';
    }
    
    
    
}
