package Ejercicio1;

public class Empleado {
   

    
    private String nombreCompleto;
    private String idEmpleado;
    private Double salarioMensual;
    private String departamento;


   public Empleado ( String nombreCompleto, String idEmpleado, Double salarioMensual,  String departamento ) {

    this.nombreCompleto=  nombreCompleto;
    this.idEmpleado=idEmpleado;
    this.salarioMensual=0.0;
    this.departamento=departamento;
    }

    
   public Empleado ( String nombreCompleto, String idEmpleado, String departamento,  Double salarioMensual ) {

    this.nombreCompleto=  nombreCompleto;
    this.idEmpleado=idEmpleado;
    this.salarioMensual=salarioMensual;
    this.departamento=departamento;
    }



   public String getNombreCompleto() {
    return nombreCompleto;
}


   public String getIdEmpleado() {
    return idEmpleado;
   }


   public double getSalarioMensual() {
    return salarioMensual;
   }


   public String getDepartamento() {
    return departamento;
   }


   public void setSalarioMensual(Double salarioMensual) {
    this.salarioMensual = salarioMensual;

     if (salarioMensual<0.0) {
      System.out.println("Error");
      salarioMensual = 0.0;
        
     }  
   }

   public void setDepartamento(String departamento) {
    this.departamento = departamento;
   }

   public void mostrarInformacion(){

    System.out.println(getNombreCompleto());
    System.out.println(getIdEmpleado());
    System.out.println(getSalarioMensual());
    System.out.println(getDepartamento());

   } 

   public Double calcularSalarioAnual(){

     Double salarioAnual=salarioMensual*12;

     return salarioAnual;

   }

    
}

