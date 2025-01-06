
package sistemabibliotecas;


public class Libro {
    //Atributos
    private String codigo, titulo, autor, genero;
    private boolean estado;
    
    //Constructor
   

    public Libro(String codigo, String titulo, String autor, String genero) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.estado = true;//Por defecto un libro nuevo true: disponible
    }
    //Getters and Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public boolean obtenerEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    //Prestar 
    public void prestar (){
        //Libro disponible
        if (estado){ //Si estado es verdadero
            estado=false;//en este punto el libro no esta disponible 
            System.out.println("El libro ha sido prestado" + titulo);
         
        //Libro no disponible
        }else//Si el estado del libro es falso???
            System.out.println("El libro no está disponible");
    }    
    //Devolver 
    public void devolver(){
        estado=true;
        System.out.println("El libro ha sido devuelto"+titulo);
    }
    
}
