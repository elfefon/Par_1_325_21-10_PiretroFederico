package Logica;

import TiposDeNaves.Nave;
import java.util.ArrayList;
import java.util.List;

public class Sistema implements Exploracion {
    
    private List<Nave> listaNaves;

    public Sistema(List<Nave> listaNaves) {
        this.listaNaves = listaNaves;
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
    
    public void iniciarExploracion(){
        explorar();
    }

    @Override
    public void explorar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
