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

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCapacidadDeTripulación() {
        return capacidadDeTripulación;
    }

    public void setCapacidadDeTripulación(int capacidadDeTripulación) {
        this.capacidadDeTripulación = capacidadDeTripulación;
    }

    public int getAñoDeLanzamiento() {
        return añoDeLanzamiento;
    }

    public void setAñoDeLanzamiento(int añoDeLanzamiento) {
        this.añoDeLanzamiento = añoDeLanzamiento;
    }    

    @Override
    public String toString() {
        return "Nave{" + "nombre=" + nombre + ", capacidadDeTripulaci\u00f3n=" + capacidadDeTripulación + ", a\u00f1oDeLanzamiento=" + añoDeLanzamiento + '}';
    }
    
    
    
}
