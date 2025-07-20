package Ejercicio2;
public class Coche {

//Atributos
String marca;
String modelo;
int añoFabricacion;
double velocidadActual=0.0;
boolean motorEncendido= false;

//Constructores
public Coche(String marca, String modelo, int añoFabricacion) {
    this.marca = marca;
    this.modelo = modelo;
    this.añoFabricacion = añoFabricacion;
}


public Coche(String marca, String modelo) {
    this.marca = marca;
    this.modelo = modelo;
    añoFabricacion=2000;
}

//Métodos

public boolean encenderMotor(){

 if (motorEncendido =! true) {
    
    motorEncendido=true; }

 return motorEncendido;

}


public boolean apagarMotor(){

 if (motorEncendido == true && velocidadActual== 0.0) {
    
    motorEncendido=false; }

 return motorEncendido;

}

public double acelerar(double incremento){
if (motorEncendido == true && incremento>0) {
    
    velocidadActual+=incremento; }

 return velocidadActual;

}

public double desacelerar(double decremento){
if (motorEncendido == true && decremento>0 && velocidadActual>decremento) {
    velocidadActual-=decremento; }

 return velocidadActual;
}

@Override
public String toString() {
    return "Coche [marca=" + marca + ", modelo=" + modelo + ", añoFabricacion=" + añoFabricacion + ", velocidadActual="
            + velocidadActual + ", motorEncendido=" + motorEncendido + "]";
}








}
