
package mariobross;
import java.util.Scanner;
//Para importar todas las librerias facilmente : java.util.*;


public class MarioBross {

  
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Grupo grupo = new Grupo();
        boolean continuar = true;//Define i el menu continua ejecutandose
        
        while(continuar==true){
            System.out.println("Seleccione una opcion");
            System.out.println("1. Crear un Mario");
            System.out.println("2. Crear un Yoshi");
            System.out.println("3. Mover un personaje");
            System.out.println("4. Calcular el total de monedas del grupo");
            System.out.println("5. Mostrar informacion de los personajes");
            System.out.println("6. Salir ");
            int opcion = scanner.nextInt();
            scanner.nextLine();
            
            
            //Switch para cada opcion
            switch(opcion){
                case 1:
                    //(boolean poderFuego, String nombre, int vidas, int monedas
                    Mario mario = new Mario(true,"Mario Bross",10,50);
                    grupo.agregarJugador(mario);
                    System.out.println("Mario se creó y agrego al grupo");
                    break;
                    
                case 2:
                    //String color, String nombre, int vidas, int monedas
                    Yoshi yoshi = new Yoshi ("Rojo","Yoshi",10,500);
                    grupo.agregarJugador(yoshi);
                    System.out.println("Yoshi se creo y se agrego al grupo");
                    break;
                    
                case 3:
                    for (Personaje personaje : grupo.getListaDePersonajes()){
                        personaje.moverse();
                        break;
                    }
                case 4:
                    int totalMonedas = grupo.calcularMonedas();
                    System.out.println("Las monedas del grupo son: "+totalMonedas);
                    break;
                
                case 5:
                    grupo.mostrarInformacionGrupo();
                    break;
                
                case 6:
                    continuar = false;
                    System.out.println("Saliendo del programa");
                    break;
                    
                default:
                    System.out.println("Agrega una opcion valida");
                    
            }
        
        }scanner.close();
        

    }
    
}
