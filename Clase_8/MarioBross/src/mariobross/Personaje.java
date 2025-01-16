
package mariobross;


public abstract class Personaje {
    //Atributos
    protected String nombre;
    protected int vidas,  monedas;
    
    //Constructor
    public Personaje(String nombre, int vidas, int monedas) {
        this.nombre = nombre;
        this.vidas = vidas;
        this.monedas = monedas;
    }
    
    //Metodo abstracto moverse
    public abstract void moverse();
    
    //Perder vida
    public int perderVida(){
        if (vidas > 0){
            vidas = vidas-1;//Otra opcion de restar 1 es: vidas--;
            
        }
        return vidas;
    }
    //Recoger moneda final
    public final int recogerMonedas(){
        monedas++;
        return monedas;
    }
    
    //ToString
    public void mostrarInfo(){
        System.out.println("Nombre "+nombre+ ", vidas "+vidas +" , monedas " +monedas);
    }
    
    
    
}
