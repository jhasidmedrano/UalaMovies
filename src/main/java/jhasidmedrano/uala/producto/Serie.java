package jhasidmedrano.uala.producto;

import java.time.LocalDate;

public class Serie extends Producto {

	private int cantidadTemporadas = 0;

	public Serie(LocalDate anioEstreno, int duracion, String titulo, int cantidadTemporadas) {
		super(anioEstreno, duracion, titulo);
		this.cantidadTemporadas = cantidadTemporadas;
	}

	@Override
	public boolean isInteresante() {
		return this.cantidadTemporadas == 4 || this.cantidadTemporadas == 5; 
	}
	
}
