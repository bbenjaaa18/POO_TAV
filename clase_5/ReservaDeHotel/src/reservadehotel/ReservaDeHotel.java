
package reservadehotel;
import java.util.Scanner; //Para solicitar datos por consola

public class ReservaDeHotel {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        //Crear instancias = objeto del hotel
        //String idHotel, String nombreHotel
        Hotel hotel1 = new Hotel("0001","Don Luis");
        
        //Agregar habitaciones al hotel
        //String numeroHabitacion, double precio, boolean disponibilidad
        hotel1.agregarHabitaciones(new Habitacion("610",40000.0,true));
        hotel1.agregarHabitaciones(new Habitacion("611",35000.0,true));
        
        //Agregar cliente
        //String idCliente, String nombreCliente
        Cliente cliente1 = new Cliente ("0001","Benjamin Mella");
        Cliente cliente2 = new Cliente ("0002","Sebastian Andrade");
        
        //Menu de opciones
        //Crear una variable que almacene loque digite el usuario
        int opcionUsuario;
       
        do{
            //Menu de opciones
            System.out.println("");
            System.out.println("Menú de opciones de Hotel");
            System.out.println("");
            System.out.println("1. Mostrar habitaciones disponibles ");
            System.out.println("2. Reserva una habitacion ");
            System.out.println("3. Mostrar las reservas del cliente ");
            System.out.println("4. Salir del Menú ");
            System.out.println("");
            System.out.println("Seleccione un numero: ");
            //Para que el usuario almecene 
            opcionUsuario = scanner.nextInt();
            scanner.nextLine();//Borramos el enter que queda digitado dentro de la memoria
            
            switch(opcionUsuario){
                case 1:
                    hotel1.MostrarHabitaciones();
                    break;
                case 2:
                    System.out.println("Ingrese el numero de la habitacion que quiere reservar: ");
                    //Almaceno el numero de habitacion en la variable numeroHabitacion
                    String numeroHabitacion = scanner.nextLine();
                    for(Habitacion habitacion : hotel1.getHabitacionesDisponibles()){
                        if(habitacion.getNumeroHabitacion().equals(numeroHabitacion)&& habitacion.isDisponibilidad()){
                            //Dejo la habitacion como no disponible
                            habitacion.setDisponibilidad(false);
                            Reserva reserva = new Reserva(hotel1, habitacion );
                            //Agregar esa reserva al cliente 
                            cliente1.agregarReserva(reserva);
                            System.out.println("Reserva exitosa...");
                            break;//Salir del for
                        }
                    }
                    break; //Salir del caser 2 para nuevamente ejecutar el menu
                case 3:
                    cliente1.mostrarReservas();
                    break;
                case 4:
                    System.out.println("Saliendo del sistema...");
                    break;
                //Si el usuario escribe otro numero
                default:
                    System.out.println("Opcion no valida ");
            }

        }
         while(opcionUsuario != 4);
            scanner.close();
    }  
}
