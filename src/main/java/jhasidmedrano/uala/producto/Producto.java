package jhasidmedrano.uala.producto;

import java.time.LocalDate;
import java.time.Period;

/**
 * Atributos comunes entre los tipos de productos
 * 
 * @author jhasidmedrano
 */
public class Producto {

	protected LocalDate anioEstreno;
	protected int duracion;
	protected String titulo;

	public Producto(LocalDate anioEstreno, int duracion, String titulo) {
		super();
		this.anioEstreno = anioEstreno;
		this.duracion = duracion;
		this.titulo = titulo;
	}

	public LocalDate getAnioEstreno() {
		return anioEstreno;
	}

	public void setAnioEstreno(LocalDate anioEstreno) {
		this.anioEstreno = anioEstreno;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public boolean isInteresante() {
		return false;
	}

	public boolean isViejo() {
		Period period = Period.between(LocalDate.now(), anioEstreno);
		return period.getYears() > 2;
	}

}
