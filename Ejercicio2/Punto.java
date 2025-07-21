package Ejercicio2;

public class Punto {

   private double x;
   private double y;

   public Punto (){
    x=0;
    y=0;
   }
   
   public Punto(double x, double y) {
    this.x = x;
    this.y = y;
   }

   public double getX() {
    return x;
   }

   public void setX(double x) {
    this.x = x;
   }

   public double getY() {
    return y;
   }

   public void setY(double y) {
    this.y = y;
   }

   public void mover(double deltaX, double deltaY) {
   x+=deltaX;
   y+=deltaY;

   }
 public void calcularDistanciaDesdeOrigen(){

  double distanciaDesdeOrigen=Math.sqrt((Math.pow(x,x)+Math.pow(y,y)));
  System.out.println("La distancia desde el punto de origen es de: "+distanciaDesdeOrigen);

 }

 
 public String Mostrarcordenadas() {
    return "Punto [x=" + x + ", y=" + y + "]";
 }

 
}
