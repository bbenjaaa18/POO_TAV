
package dimarsa;


public class Dimarsa {


    public static void main(String[] args) {
        //Crear productos
        //String marca, int garantiaMeses, String idProducto, String nombreProducto, double precioProducto
        Electronico electronico1 = new Electronico ("Logi",12,"MS001","Mouse",10000.0);
        
        //(String talla, String color, String idProducto, String nombreProducto, double precioProducto)
        Ropa ropa1 = new Ropa ("L","Negro","PL001","Polera manga corta",15000.0);
        
        //(String idCliente, String nombreCliente)
        Cliente cliente1 = new Cliente ("CL002","Francisca");
        
        //Agregar pedidos
        Pedidos pedido1 = new Pedidos();
        pedido1.agregarProducto(electronico1);
        pedido1.agregarProducto(ropa1);
        
        //Asociar el cliente al pedido
        cliente1.agregarPedidos(pedido1);
        
        //Mostrar la informacion por consola
        cliente1.mostrarPedidos();
    }
    
}
