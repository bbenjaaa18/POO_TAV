
package reservadehotel;

import java.util.ArrayList;


public class Cliente {
    private String idCliente;
    private String nombreCliente;
    private ArrayList<Reserva>reservasRealizadas;

    
    //Al crear constructor seleccionar todos los atributos menos el ArrayList.
    public Cliente(String idCliente, String nombreCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.reservasRealizadas = new ArrayList<>();
    }
    //Metodo de agregar
    public void agregarReserva(Reserva reserva){
        reservasRealizadas.add(reserva);
        
    }
    //Metodo para recorrer y mostrar la lista
    public void mostrarReservas(){
        System.out.println("ReservasActuales" + nombreCliente);
        for (Reserva reserva : reservasRealizadas){
            System.out.println(reserva);
        }
        
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public ArrayList<Reserva> getReservasRealizadas() {
        return reservasRealizadas;
    }

    public void setReservasRealizadas(ArrayList<Reserva> reservasRealizadas) {
        this.reservasRealizadas = reservasRealizadas;
    }
    
    
    
}
