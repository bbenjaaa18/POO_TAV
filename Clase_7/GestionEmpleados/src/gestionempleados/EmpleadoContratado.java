
package gestionempleados;


public class EmpleadoContratado extends Empleado implements BonusCalculable{
    //Dejamos la clase como clase hija de emleado y agregamos que sera intrfaz de BonusCalculable

    //Constructor
    public EmpleadoContratado(String idEmpleado, String nombreEmpleado, double sueldoBaseEmpleado) {
        super(idEmpleado, nombreEmpleado, sueldoBaseEmpleado);
    }
    
    //Implementar metodo de la interface
    //Copiampos tal cual de BonusCalculable
    @Override
    public double calcularBono(){
        return getSueldoBaseEmpleado() * 0.10;//Bono del 10% al empleado
    }
    
    //Calcular Salario
    public double CalcularSalario(){
        //Sueldo base + bono
        return getSueldoBaseEmpleado() + calcularBono();
    }
  
    
    
    
}
