
package mariobross;


public class Yoshi extends Personaje implements SuperPoder {
    //Atributo especifidco de Yoshi
    private String color;
    private boolean poder;

    public Yoshi(String color, String nombre, int vidas, int monedas) {
        super(nombre, vidas, monedas);
        this.color = color;
    }
    @Override
    public void moverse(){
        System.out.println(nombre + " Se mueve corriendo rapidamente");
        
    }
    @Override
    public int comerEstrella(){
        poder = true;
        return 8;//Los segundos del poder
    }
    @Override
    public boolean comerHongo(){
        return false;//Yoshi no cambia al comer un hongo
    }
    public void usarLengua(){
        if (poder  == true){
            System.out.println(nombre + " usa su lengua para comer enemigos");
        }else{
            System.out.println("Yoshi no tiene el poder");
        }
    }
}
