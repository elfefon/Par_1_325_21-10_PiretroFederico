package Logica;

import TiposDeNaves.Nave;
import java.util.ArrayList;
import java.util.List;

public class ListaNaves {
    private List<Nave> listaNaves;

    public ListaNaves() {
        this.listaNaves = new ArrayList<>();
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
    
    
}
