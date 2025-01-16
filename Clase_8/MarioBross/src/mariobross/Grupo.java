
package mariobross;

import java.util.ArrayList;


public class Grupo {
    private ArrayList<Personaje>listaDePersonajes = new ArrayList<>();
    
    public void agregarJugador(Personaje jugador){
        listaDePersonajes.add(jugador);
        
    }
    public int calcularMonedas(){
        int totalMonedas = 0;
        for (Personaje monedasPersonajes : listaDePersonajes){
            totalMonedas += monedasPersonajes.monedas;
            if (totalMonedas>=100){
                totalMonedas = totalMonedas + 100;                
            }
        }
        return totalMonedas;
        
    }
    public void mostrarInformacionGrupo(){
        for (Personaje personaje : listaDePersonajes )
            personaje.mostrarInfo();
    }

    public ArrayList<Personaje> getListaDePersonajes() {
        return listaDePersonajes;
    }

    public void setListaDePersonajes(ArrayList<Personaje> listaDePersonajes) {
        this.listaDePersonajes = listaDePersonajes;
    }
    
}
