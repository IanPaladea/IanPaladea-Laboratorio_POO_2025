package paquete;

import java.time.Duration;

public class ArchivoMultimedia{
	protected String nombre;
	protected Duration duracion;
	
	public ArchivoMultimedia(String nombre, Duration duracion) {
		this.nombre = nombre;
		this.duracion = duracion;
	}

	public String getNombre() {
		return nombre;
	}

	public Duration getDuracion() {
		return duracion;
	}

	public void setDuracion(Duration duracion) {
		this.duracion = duracion;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void reproducir() {
		
	}
	
}
