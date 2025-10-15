package TiposDeNaves;

public class CrucerosEstelares extends Nave{ 
    
    private int CantidadPasajeros;
    
    public CrucerosEstelares(String nombre, int capacidadDeTripulación, int añoDeLanzamiento,int cantPasajeros) {
        super(nombre, capacidadDeTripulación, añoDeLanzamiento);
        this.CantidadPasajeros = cantPasajeros;
    }
    
}
