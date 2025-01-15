
package gestionempleados;

import java.util.ArrayList;


public class Departamento {
    //Atributos
    private String idDepartamento;
    private String nombreDepartamento;
    private ArrayList<Empleado>listaDeEmpleados;

    public Departamento(String idDepartamento, String nombreDepartamento) {
        this.idDepartamento = idDepartamento;
        this.nombreDepartamento = nombreDepartamento;
        this.listaDeEmpleados = new ArrayList<>();
    }
    //Metodo para agregar empleados
    //Siempre ira este metodo para los ArrayList
    public void agregarEmpleado(Empleado empleadoParaAgregar){
        listaDeEmpleados.add(empleadoParaAgregar);
    }
    
    public double calcularCostoTotalSueldos(){
        double total = 0.0;
        for(Empleado empleadoEncontradoPorElFor : listaDeEmpleados){
            total += empleadoEncontradoPorElFor.calcularSalario();
        }
        System.out.println(total);
        return total;
    }
    

    //Metodo para mostrar info de departamento y sus empleados
    public void mostrarEmpleados(){
        System.out.println("Departamento: "+nombreDepartamento);
        for (Empleado empleadoEncontrado : listaDeEmpleados){
            System.out.println(empleadoEncontrado.getNombreEmpleado()+"Salario total: " + empleadoEncontrado.calcularSalario()); 
        }
    }
}
