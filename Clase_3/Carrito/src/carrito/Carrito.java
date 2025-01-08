
package carrito;


public class Carrito {


    public static void main(String[] args) {
        //Crear datos
        //String idProducto, String nombreProducto, double precio
        Producto producto1 = new Producto ("001","Mouse Logi",15000.0);
        Producto producto2 = new Producto ("002", "Teclado",20000.0);
        Producto producto3 = new Producto ("003","Notebook",600000.0);
        
        //Crear Cliente
        Cliente cliente1 = new Cliente ("0001C","Benjamin Mella");
        
        //Mostrar info del cliente
        cliente1.MostrarInfoCliente();
        
        //cliente
        cliente1.comprarProducto(producto1);
        cliente1.comprarProducto(producto2);
        cliente1.comprarProducto(producto3);
        
        //Mostrar info del cliente
        cliente1.MostrarInfoCliente();
        

    }
    
}
