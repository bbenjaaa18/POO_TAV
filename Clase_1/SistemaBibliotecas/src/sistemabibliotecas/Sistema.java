
package sistemabibliotecas;

import java.util.ArrayList;


public class Sistema {
    private ArrayList<Libro>catalogoLibros;
    private ArrayList<Usuario>listaUsuarios;

    public Sistema() {
        this.catalogoLibros = new ArrayList<>();
        this.listaUsuarios = new ArrayList<>();
    }

    public ArrayList<Libro> getCatalogoLibros() {
        return catalogoLibros;
    }

    public void setCatalogoLibros(ArrayList<Libro> catalogoLibros) {
        this.catalogoLibros = catalogoLibros;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }
    //Registrar o agregar libros
    public void AgregarLibros(Libro libro){
        catalogoLibros.add(libro);
        //Agregando un libro
        System.out.println("libro agregado: "+libro.getTitulo());
    }
    //Registrar o añadir usuarios
    public void agregarUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
        //Agregando un usuario
        System.out.println("Usuario agregado: "+usuario.getNombre());

    }
    //metodo verificar disponibilidad = estado booleano
    public boolean verificarDisponibilidad(String codigo){
        //Recorremos la lista libros
        for (Libro libro: catalogoLibros){
            //Si el codigo del libro es igual al codigo de la lista
            if (libro.getCodigo().equals(codigo)){
                return libro.obtenerEstado();
            
            }
        }
        return false;
        
    }
    //Metodo para generar un informe
    public void generarInforme(){
        System.out.println("Estado actual de la biblioteca");
        for (Libro libro: catalogoLibros){  //? = if 
            System.out.println("titulo del libro: "+libro.getTitulo() + "estado: " + (libro.obtenerEstado()?"Disponible":"No disponible"));
        }
    }
    
    
    
    
    
    
    
}
