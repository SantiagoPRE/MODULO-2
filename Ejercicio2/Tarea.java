package Ejercicio2;

public class Tarea {

private String descripcion;
private int prioridad;
private boolean completada= false;


public Tarea(String descripcion) {
    this.descripcion = descripcion;
    this.prioridad = 3 ;
}


public Tarea(String descripcion, int prioridad) {
    this.descripcion = descripcion;
    if (prioridad>=1 && prioridad<=3) {  
    this.prioridad = prioridad;
}
    else{System.out.println("Error solo hay tres prioridades");}
}


public String getDescripcion() {
    return descripcion;
}


public int getPrioridad() {
    return prioridad;
}


public boolean isCompletada() {
    return completada;
}


public void setPrioridad(int prioridad) {
    if (prioridad>=1 && prioridad<=3) {  
    this.prioridad = prioridad;
}
}


public boolean marcarComoCompletada(boolean completada) {

    completada=true;
    return completada;

}


public String mostrarEstado() {
    return "Tarea [descripcion=" + descripcion + ", prioridad=" + prioridad + ", completada=" + completada + "]";
}



    
}
