package publicaciones;

public class libro  extends publicacion{


	private int codigo;
	private String autor;
	
	public libro(String titulo, int codigo, String autor) {
		super(titulo);
		this.codigo = codigo;
		this.autor = autor;
	}
	
public int getCodigo(){
	return codigo;
}
public String getAutor() {
	return autor;
}
public void setCodigo(int codigo) {
	this.codigo=codigo;
}
public void setAutor(String autor) {
	this.autor=autor;
}
@Override
public void nombrartitulo() {
	System.out.println("el titulo de esta publicacion es"+ titulo);
}
	
	
}
