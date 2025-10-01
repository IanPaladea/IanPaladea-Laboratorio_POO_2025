package Cuenta;

public class CajaDeAhorro extends cuenta {

	public CajaDeAhorro(float saldo, String numeroCuenta) {
		super(saldo, numeroCuenta);

	}
@Override
public void realizaExtraccion() {
	System.out.println("extrajiste un total de "+ saldo);
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
