
package dimarsa;


public class Producto {
    //Atributos
    private String idProducto;
    private String nombreProducto;
    private double precio;

    //Constructor
    public Producto(String idProducto, String nombreProducto, double precioProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precioProducto;
    }

    //Getters and Setters
    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecioProducto() {
        return precio;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precio = precioProducto;
    }
    
    //Agregar metodo calcular descuento / En este caso si retorna algo, por eso no ocupamos void
    public double calcularDescuento(double descuento){
        return precio - (precio*descuento/100);
    }

    //ToString
    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precio=" + precio + '}';
    }
    
}
