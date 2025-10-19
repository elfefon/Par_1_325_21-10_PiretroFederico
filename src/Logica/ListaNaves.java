package Logica;

import TiposDeNaves.Nave;
import java.util.ArrayList;
import java.util.List;

public class ListaNaves {
    private List<Nave> listaNaves;

    public ListaNaves() {
        this.listaNaves = new ArrayList<>();
    }

    public List<Nave> getListaNaves() {
        return listaNaves;
    }
    
    public void agregarNave(Nave nave){
        listaNaves.add(nave);
    }
    
    public void mostrarNaves(){
        System.out.println("--- Naves ---");
        for (Nave nave: listaNaves){
            System.out.println(nave);
        }
    }
    
    public Nave buscarNavePorNombre(String nombre){
        for (int i = 0; i < getListaNaves().size(); i++){
            Nave naveActual = getListaNaves().get(i);
            if(naveActual.getNombre().equalsIgnoreCase(nombre))
                return naveActual;
        } 
        return null;
    }
    
    public boolean eliminarNavePorNombre(String nombre){
        for (int i = 0; i < getListaNaves().size(); i++){
            Nave naveActual = getListaNaves().get(i);
            if(naveActual.getNombre().equals(nombre)){
                listaNaves.remove(i);
                return true;
            }}
        return false;
    }
    
    public boolean naveExistente(String nombre, int año){
        for(int i = 0; i < getListaNaves().size(); i++){
            Nave naveActual = getListaNaves().get(i);
            if(naveActual.getNombre().equalsIgnoreCase(nombre) && naveActual.getAñoDeLanzamiento() == año){
                return true;
            }
        }
        return false;
    }
        
    public void iniciarExploracionGeneral() {
        for (Nave nave : getListaNaves()) {
            nave.iniciarMision();
        }
}
    
}
