
package carrito;


public class CarritoDeCompras {
    //Atributos //String simula una lista
    private String productos;
    private double total;
    
    //Constructor

    public CarritoDeCompras() {
    
    this.productos = "";
    this.total = 0.0;
    }


    public String getProductos() {
        return productos;
    }

    public void setProductos(String productos) {
        this.productos = productos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }
    //Metodo para agregar un producto a carrito
    public void agregarProducto (Producto producto){
        //Evaluar si no la lista de productos esta vacia
        if(! productos.isEmpty()){
            productos += ", ";

        }
        productos += producto.getNombreProducto();
        total += producto.getPrecio();
        System.out.println("Producto agregado: "+producto.getNombreProducto());
        
    }
    
    
    
    //Metodo para mostrar el contenido del carrito
    public void mostrarContenido (){
        System.out.println("Productos carrito: "+productos);
        System.out.println("Total productos: "+total);
    }
    
    
    
    
    
}