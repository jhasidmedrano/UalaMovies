package jhasidmedrano.uala.producto;

import java.time.LocalDate;

public class Pelicula extends Producto {

	private boolean tieneOscar = false;

	public Pelicula(LocalDate anioEstreno, int duracion, String titulo) {
		super(anioEstreno, duracion, titulo);
	}

	public boolean isTieneOscar() {
		return tieneOscar;
	}

	public void setTieneOscar(boolean tieneOscar) {
		this.tieneOscar = tieneOscar;
	}
	
	@Override
	public boolean isInteresante() {
		return this.tieneOscar;
	}
		

}
