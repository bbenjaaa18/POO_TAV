
package sistemabibliotecas;


public class SistemaBibliotecas {


    public static void main(String[] args) {
    //Crear instancia del sistema
    Sistema sistema= new Sistema();
    
    //Crear libros
    //String codigo, String titulo, String autor, String genero
    
    Libro libro1 = new Libro ("001","Papelucho","Marcela Paz","Infantil" );
    Libro libro2 = new Libro ("002","Metamorfosis","Franz Kakfa","Ficcion" ); 
    //Crear Usurios
    //String run, String nombre
    Usuario usuario1 = new Usuario ("21212121", "Benjamin");
    
    
    //Registrar libros y usuarios
    sistema.AgregarLibros(libro1);
    sistema.AgregarLibros(libro2);
    
    //Registrar Usuario
    sistema.agregarUsuario(usuario1);
    
    //Probar funcionalidad
    //Benjamin toma prestado el libro metamorfosis y papelucho
    usuario1.tomarPrestado(libro2);
    usuario1.tomarPrestado(libro1);
    sistema.generarInforme();
    
    usuario1.devolverLibro(libro2);
    
    sistema.generarInforme();
    }
   
}
