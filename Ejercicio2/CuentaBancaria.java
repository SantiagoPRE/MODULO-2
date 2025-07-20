package Ejercicio2;

public class CuentaBancaria {

 //atributos
   private String numeroCuenta;
   private String nombreTitular;
   private double saldo;

//constructores
 public CuentaBancaria(String numeroCuenta,String nombreTitular,double saldo ){
 this.numeroCuenta= numeroCuenta;
 this.nombreTitular=nombreTitular;
 this.saldo=0.0;
}

 public CuentaBancaria(String numeroCuenta,double saldo,String nombreTitular) {
    this.numeroCuenta = numeroCuenta;
    this.nombreTitular = nombreTitular;
    double saldoInicial= 0.0;
    this.saldo= saldoInicial;
 }

 //métodos
 public String getNumeroCuenta() {
    return numeroCuenta;
 }

 public String getNombreTitular() {
    return nombreTitular;
 }

 public double getSaldo() {
    return saldo;
 }

 public  double depositar(double monto){

if (monto>0) {
saldo+=monto;
return saldo;
}
else{System.out.println("No se puedo depositar el monto al saldo por lo tanto sigue igual");
return saldo;}

 }

public  double retirar(double monto){

if (monto>0 && monto<=saldo) {
saldo-=monto;
return saldo;
}
else{System.out.println("No se puedo retirar el monto del saldo por lo tanto sigue igual");
return saldo;}

 }

 public void mostrarInformacion(){

    System.out.println(numeroCuenta);
    System.out.println(nombreTitular);
    System.out.println(saldo);

 }




    
}
