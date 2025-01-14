
package dimarsa;


public class Ropa extends Producto{
    
    //Aributos adicionales
    private String talla;
    private String color;
    
    //Constructor
    public Ropa(String talla, String color, String idProducto, String nombreProducto, double precioProducto) {
        super(idProducto, nombreProducto, precioProducto);
        this.talla = talla;
        this.color = color;
    }
    
    //Getters and Setters
    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    //To String
    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + ", color=" + color + '}';
    }
    
    //Metodo cambiar Talla
    public void cambiarTalla (String nuevaTalla){
        talla = nuevaTalla;
        System.out.println("La talla ha sido cambiada");
                
    }   
}
