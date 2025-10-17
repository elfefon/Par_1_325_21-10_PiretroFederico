package Logica;

public class Sistema{
  
    //manejo y simplificacion de input
                        
    public int inputTipoNave(String tipo){
        
        if (TiposDeNave.naveExploracion.name().equalsIgnoreCase(tipo)){
            return 1;
        }else if (TiposDeNave.cargueros.name().equalsIgnoreCase(tipo)){
            return 2;
        }else if (TiposDeNave.crucerosEstelares.name().equalsIgnoreCase(tipo)){
            return 3;
        }else {
            return 0;
        }
    }
        
}
