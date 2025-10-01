package publicaciones;

public class revista extends publicacion {
	private int numeroEdicion;
	private String fecha;
	public revista(String titulo, int numeroEdicion, String fecha) {
		super(titulo);
		this.numeroEdicion = numeroEdicion;
		this.fecha = fecha;
	}
	
public int getNumeroedicion() {
	return numeroEdicion;
}
public String getfecha() {
	return fecha;
}
public void setNumeroedicion(int numeroEdicion) {
	this.numeroEdicion=numeroEdicion;
}
public void setFecha(String fecha) {
	this.fecha=fecha;
}
@Override
public void nombrartitulo() {
	System.out.println("el titulo de esta publicacion es"+ titulo);
}
	
	
	
	
	
}
