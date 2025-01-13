
package reservadehotel;

import java.util.ArrayList;


public class Hotel {
    //Atributos
    private String idHotel;
    private String nombreHotel;
    private ArrayList<Habitacion>habitacionesDisponibles;
    
    //Constructor

    public Hotel(String idHotel, String nombreHotel) {
        this.idHotel = idHotel;
        this.nombreHotel = nombreHotel;
        //Agregamos manualmente el ArrayList
        this.habitacionesDisponibles = new ArrayList<>();
    }
    //Metodo para agregar habitaciones a la lista
    public void agregarHabitaciones(Habitacion habitacion){
        habitacionesDisponibles.add(habitacion);
        
    }
    //Metodo para ver las habitaciones disponibles
    public void MostrarHabitaciones(){
        System.out.println("Habitaciones disponibles en el hotel" + nombreHotel);
        for(Habitacion habitacion : habitacionesDisponibles){
            System.out.println(habitacion);
        }
        
    }

    public String getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(String idHotel) {
        this.idHotel = idHotel;
    }

    public String getNombreHotel() {
        return nombreHotel;
    }

    public void setNombreHotel(String nombreHotel) {
        this.nombreHotel = nombreHotel;
    }

    public ArrayList<Habitacion> getHabitacionesDisponibles() {
        return habitacionesDisponibles;
    }

    public void setHabitacionesDisponibles(ArrayList<Habitacion> habitacionesDisponibles) {
        this.habitacionesDisponibles = habitacionesDisponibles;
    }
    
    
}
