package Cuenta;

public class cuenta {
	protected float saldo;
	protected String numeroCuenta;

	
	
	
	
public cuenta (float saldo, String numeroCuenta) {
	this.saldo= saldo;
	this.numeroCuenta= numeroCuenta;
	
}
public Float getsaldo() {
	return saldo;
}
public String getnumeroCuenta() {
	return numeroCuenta;
}
public void  setsaldo(float saldo) {
	this.saldo=saldo;
	
}
public void setnumeroCuenta(String numeroCuenta) {
	this.numeroCuenta=numeroCuenta;
}

public void realizaExtraccion() {
	
}







}