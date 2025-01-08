
package carrito;


public class Producto {
    //Atributos del producto
    private String idProducto;
    private String nombreProducto;
    //Se usa para precios generalmente por decimales
    private double precio;
    
    //Constructor

    public Producto(String idProducto, String nombreProducto, double precio) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        
        //Getters and setters
    }

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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //To String

    @Override
    public String toString() {
        return "Producto{" + "idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precio=" + precio + '}';
    }
    
    
}
