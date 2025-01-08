
package carrito;


public class Cliente {
    private String idCliente, nombreCliente;
    private CarritoDeCompras carrito;

    public Cliente(String idCliente, String nombreCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.carrito = new CarritoDeCompras();//Iniciamos el carrito vacio
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

    public CarritoDeCompras getCarrito() {
        return carrito;
    }

    public void setCarrito(CarritoDeCompras carrito) {
        this.carrito = carrito;
    }
    
    public void comprarProducto(Producto producto){
        carrito.agregarProducto(producto);
    }
    
    //Metodo para mostrar info del cliente
    public void MostrarInfoCliente (){
        System.out.println("Id Cliente: "+idCliente+ ", Nombre: "+nombreCliente);
        carrito.mostrarContenido();
    }
    
    
    
}
