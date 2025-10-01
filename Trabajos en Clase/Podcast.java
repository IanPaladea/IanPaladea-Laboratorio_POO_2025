package paquete;

import java.time.Duration;

public class Podcast extends ArchivoMultimedia{
	private int episodios;

	public Podcast(String nombre, Duration duracion, int episodios) {
		super(nombre, duracion);
		this.episodios = episodios;
	}
	
	
@Override
public void reproducir() {
	System.out.println("Reproduciendo Podcast");
}
}
