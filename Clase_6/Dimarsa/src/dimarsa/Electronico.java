
package dimarsa;


public class Electronico extends Producto{
    
    //Atributos adicionales
    private String marca;
    private int garantiaMeses;
    
    //Constructor heredado
    public Electronico(String marca, int garantiaMeses, String idProducto, String nombreProducto, double precioProducto) {
        super(idProducto, nombreProducto, precioProducto);
        this.marca = marca;
        this.garantiaMeses = garantiaMeses;
    }
    
    //Metodo de meses extras
    public void extenerGarantia (int mesesExtras){
        garantiaMeses += mesesExtras;
        //garantiaMeses = garantiaMeses + mesesExtras
        //Otra opcion que significan lo mismo
        System.out.println("La garantia ha sido extendida a "+ garantiaMeses + " meses " );
    }

    //Agregar ToString 
    @Override
    public String toString() {
        return "Electronico{" + "marca=" + marca + ", garantiaMeses=" + garantiaMeses + '}';
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }
    
}
