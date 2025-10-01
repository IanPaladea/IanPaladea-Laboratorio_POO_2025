package paquete;

import java.time.Duration;

public class Video extends ArchivoMultimedia{
	private String resolucion;

	public Video(String nombre, Duration duracion, String resolucion) {
		super(nombre, duracion);
		this.resolucion = resolucion;
	}

	public String getResolucion() {
		return resolucion;
	}

	public void setResolucion(String resolucion) {
		this.resolucion = resolucion;
	}
	
@Override
public void reproducir() {
	System.out.println("Reproduciendo video");
}	
	
}
