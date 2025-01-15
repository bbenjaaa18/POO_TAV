
package gestionempleados;


public class GestionEmpleados {


    public static void main(String[] args) {      
        //Crear departamento
        //String idDepartamento, String nombreDepartamento
        Departamento departamento1 = new Departamento("001","Contabilidad");
        Departamento departamento2 = new Departamento("002","Informatica");

        
        //Crear Empleados
        //String idEmpleado, String nombreEmpleado, double sueldoBaseEmpleado
            Empleado empleado1 = new EmpleadoContratado  ("001","Marcelo",500000);
            Empleado empleado3 = new EmpleadoContratado ("003","Benjamin",550000.0);
        //(int horasTrabajadas, double precioPorHora, String idEmpleado, String nombreEmpleado, double sueldoBaseEmpleado)
            Empleado empleado2 = new EmpleadoPartTime (100,1000.0,"002","Raul",100000);
        
        //Asignar un empleado a un departamento
            departamento1.agregarEmpleado(empleado2);
            departamento2.agregarEmpleado(empleado1);
            departamento1.agregarEmpleado(empleado3);
            
        //Mostrar info de los departamentos
            departamento1.mostrarEmpleados();
            departamento2.mostrarEmpleados();
        
        //Calcular total de los sueldos
            System.out.println("Costo total de los sueldos ");
            departamento1.calcularCostoTotalSueldos();
            departamento2.calcularCostoTotalSueldos();
    }
    
    
}
