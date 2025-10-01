package publicaciones;

public class diario  extends publicacion{
	private int fecha;
	private String editorial;
	
	public diario(String titulo, int fecha, String editorial) {
		super(titulo);
		this.fecha = fecha;
		this.editorial = editorial;
	}
public int getFecha() {
	return fecha;
}
public String getEditorial() {
	return editorial;
}
public void setFecha(int fecha) {
	this.fecha=fecha;
}
public void setEditorial(String editorial) {
	this.editorial=editorial;
}

@Override
public void nombrartitulo() {
	System.out.println("el titulo de esta publicacion es"+ titulo);
}

}
	