
package mariobross;


public class Mario extends Personaje implements SuperPoder {
    private boolean poderFuego;//False
    //Constructor

    public Mario(boolean poderFuego, String nombre, int vidas, int monedas) {
        super(nombre, vidas, monedas);
        this.poderFuego = poderFuego;
    }
    //Copiamos el metodo de la clase padre que es moverse
    @Override
    public void moverse(){
        System.out.println(nombre + "Se mueve corriendo rapidamente");
        
    }
    @Override
    public int comerEstrella(){
        poderFuego = true;//Mario tiene el poder de lanzar bolas de fuego
        return 10;//Los segundos del poder
    }
    @Override
    public boolean comerHongo(){
        return true;//Mario crece al comer hongos
    }
    
    public void lanzarBolasFuego(){
        if (poderFuego ==true){
            System.out.println(nombre + "lanza bolas de fuego");
        }else{
            System.out.println("No tiene el poder activado");
        }
        
    }
    
    
}
