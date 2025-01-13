
package reservadehotel;


public class Reserva {
    private Hotel hotel;//Tipo de datos 
    private Habitacion habitacionReservada;

    public Reserva(Hotel hotel, Habitacion habitacionReservada) {
        this.hotel = hotel;
        this.habitacionReservada = habitacionReservada;
    }

    @Override
    public String toString() {
        return "Reserva{" + "hotel=" + hotel + ", habitacionReservada=" + habitacionReservada + '}';
    }
    
    
    
    
    
    
   
}
