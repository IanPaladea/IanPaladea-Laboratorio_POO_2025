package paquete;

import java.time.Duration;

public class Cancion extends ArchivoMultimedia{
	private String artista;

	public Cancion(String nombre, Duration duracion, String artista) {
		super(nombre, duracion);
		this.artista = artista;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	
 @Override
 public void reproducir() {
		System.out.println("Reproduciendo canción");
	}
	
	
	
}
