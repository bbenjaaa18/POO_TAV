
package dimarsa;

import java.util.ArrayList;



public class Cliente {
    
    //Atributos
    private String idCliente;
    private String nombreCliente;
    private ArrayList <Pedidos> pedidosRealizados ;

    //Creamos constructor sin seleccionar ArrayList y lo realizamos manualmente
    public Cliente(String idCliente, String nombreCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.pedidosRealizados = new ArrayList <>();
         
    }
    
    //Metodo para agregar pedidos
    public void agregarPedidos(Pedidos pedidosRecibidos){
        pedidosRealizados.add(pedidosRecibidos);
        System.out.println("Producto agregado a la lista "+pedidosRecibidos);
    }
    
    //Metodo para mostrar los pedidos realizados
    public void mostrarPedidos(){
        System.out.println("Pedidos realizados por: "+nombreCliente);
        for (Pedidos productoEncontrado : pedidosRealizados){
            System.out.println(productoEncontrado);
            
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

    public ArrayList<Pedidos> getPedidosRealizados() {
        return pedidosRealizados;
    }

    public void setPedidosRealizados(ArrayList<Pedidos> pedidosRealizados) {
        this.pedidosRealizados = pedidosRealizados;
    }
    
}
