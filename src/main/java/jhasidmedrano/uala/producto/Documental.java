package jhasidmedrano.uala.producto;

import java.time.LocalDate;

public class Documental extends Producto{
	
	private static final String TITULO_UNOFFICIAL = "unofficial";

	public Documental(LocalDate anioEstreno, int duracion, String titulo) {
		super(anioEstreno, duracion, titulo);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public boolean isInteresante() {
		return this.titulo.equalsIgnoreCase(TITULO_UNOFFICIAL);
	}
	
}
