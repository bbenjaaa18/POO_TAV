
package dimarsa;

import java.util.ArrayList;



public class Pedidos {
    
    //Atributos
    private ArrayList <Producto> listaDeProductos;
    private double total;//monto total del pedido

    //Iniciamos el constructor vacio
    public Pedidos() {
        this.listaDeProductos = new ArrayList <>();//Iniciamos la lista vacia
        this.total = 0.0;//total en 0
    }
    
    //Metodo agregar proucto al pedido
    public void agregarProducto (Producto productoRecibido){
        listaDeProductos.add(productoRecibido);
        total += productoRecibido.getPrecioProducto();
 
    }
    
    //Calcular total del pedido
    public double calcularTotal (){
        return total;

    }

    //ToString
    @Override
    public String toString() {
        return "Pedidos{" + "listaDeProductos=" + listaDeProductos + ", total=" + total + '}';
    }
    
}
