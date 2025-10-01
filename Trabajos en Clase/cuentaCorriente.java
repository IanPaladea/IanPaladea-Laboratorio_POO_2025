package Cuenta;

public class cuentaCorriente  extends cuenta{
	private  int limiteDescubierto;

	public cuentaCorriente(float saldo, String numeroCuenta, int limiteDescubierto) {
		super(saldo, numeroCuenta);
		this.limiteDescubierto = limiteDescubierto;
	}
	
	public int getlimiteDescubierto() {
		return limiteDescubierto;
	}
	public void setLimiteDescubierto(int limiteDescubierto) {
		this.limiteDescubierto=limiteDescubierto;
	}
	
@Override
	public void realizaExtraccion() {
		System.out.println("extrajiste un total de "+ saldo);
	}
		
			
	
	
	
	
	
	
	
	
	
	
	

}
