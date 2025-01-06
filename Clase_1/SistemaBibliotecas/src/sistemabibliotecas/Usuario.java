
package sistemabibliotecas;

import java.util.ArrayList;


public class Usuario {
    private String run, nombre;
    private ArrayList <Libro> librosPrestados;
    
    //Constructor 
    
    public Usuario(String run, String nombre) {
        this.run = run;
        this.nombre = nombre;
        //Para iniciar una list vacia
        this.librosPrestados = new ArrayList<>();
    }
    //Getters and Setters

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Libro> getLibrosPrestados() {
        return librosPrestados;
    }

    public void setLibrosPrestados(ArrayList<Libro> librosPrestados) {
        this.librosPrestados = librosPrestados;
    }
    
    //Tomar Prestado, trabaja con la clase libro
    public void tomarPrestado (Libro libro){
        if (libro.obtenerEstado()==true){
            librosPrestados.add(libro);//Agregamos el libro a la list de prestados
            libro.prestar();//Marque el libro como no disponible = false y me entregue un msg por consola
            
        }else
            System.out.println("El libro no sta disponible para ser prestado");
        
    }
    //y devolver libro
    public void devolverLibro (Libro libro){
        //Si la lista de librosPrestados tiene algun libro 
        if (librosPrestados.contains(libro)){
            librosPrestados.remove(libro);
            //Libro estado esta en false
            libro.devolver();//Cambiar el estado de false a true 
        }else{
            System.out.println("El libro no fue solicitado por este usuario");
        }
    }
    
    
    
    
}
