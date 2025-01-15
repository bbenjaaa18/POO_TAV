
package gestionempleados;


public class EmpleadoPartTime extends Empleado implements BonusCalculable {
    //Dejamos la clase como clase hija de emleado y agregamos que sera intrfaz de BonusCalculable
    private int horasTrabajadas;
    private double precioPorHora;

    public EmpleadoPartTime(int horasTrabajadas, double precioPorHora, String idEmpleado, String nombreEmpleado, double sueldoBaseEmpleado) {
        super(idEmpleado, nombreEmpleado, sueldoBaseEmpleado);
        this.horasTrabajadas = horasTrabajadas;
        this.precioPorHora = precioPorHora;
    }
    
    //Metodo de la interface
    @Override
    public double calcularBono(){
        return horasTrabajadas * precioPorHora  * 0.05;//Bono del 5% al empleado
    }
    
    //Calcular Salario
    @Override
    public double calcularSalario(){
    //Sueldo base + bono
    return horasTrabajadas + precioPorHora + calcularBono();
    }

    
    
}
