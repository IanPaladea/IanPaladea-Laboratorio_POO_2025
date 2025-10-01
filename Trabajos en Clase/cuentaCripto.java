package Cuenta;

public class cuentaCripto extends cuenta {
	private float comision;
	private String claveBlockchain;
	public cuentaCripto(float saldo, String numeroCuenta, float comision, String claveBlockchain) {
		super(saldo, numeroCuenta);
		this.comision = comision;
		this.claveBlockchain = claveBlockchain;
	}

	public float getComision() {
		return comision;
	}
	public String getclaveBlockChain() {
		return claveBlockchain;
	}
	public void setComision(float Comision) {
		this.comision=comision;
	}
	public void setclaveBlockChain(String claveBlockChain) {
		this.claveBlockchain=claveBlockchain;
	}
	

	
	@Override
	public void realizaExtraccion() {
		System.out.println("extrajiste un total de "+ saldo);
	}
		
	
	
	
	
}
