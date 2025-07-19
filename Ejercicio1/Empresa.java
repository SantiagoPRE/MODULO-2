package Ejercicio1;

public class Empresa {
    public static void main(String[] args) {

        Empleado empleado = new Empleado("Carol", "12345", 0.0, "ventas");

        Empleado empleado1 = new Empleado("Pedro", "33333", "ventas", 200.000);

        Empleado empleado2 = new Empleado("Sara", "23464", 0.0, "ventas");

        empleado.mostrarInformacion();
        empleado1.mostrarInformacion();
        empleado2.mostrarInformacion();

        empleado.setSalarioMensual(150_000.0);
        empleado2.setSalarioMensual(300_000.0);

        empleado.mostrarInformacion();
        empleado2.mostrarInformacion();

       
        Double salaDouble= empleado1.calcularSalarioAnual();

        System.out.println(salaDouble);

        
        

    }

}

