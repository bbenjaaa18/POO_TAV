
package reservadehotel;


public class Habitacion {
    //Atributos
    private String numeroHabitacion;
    private double precio;
    private boolean disponibilidad;
    
    //Constructor

    public Habitacion(String numeroHabitacion, double precio, boolean disponibilidad) {
        this.numeroHabitacion = numeroHabitacion;
        this.precio = precio;
        this.disponibilidad = disponibilidad;
    }
    
    //Getters and Setters

    public String getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public void setNumeroHabitacion(String numeroHabitacion) {
        this.numeroHabitacion = numeroHabitacion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Habitacion{" + "numeroHabitacion=" + numeroHabitacion + ", precio=" + precio + ", disponibilidad=" + disponibilidad + '}';
    }
    
    
}
