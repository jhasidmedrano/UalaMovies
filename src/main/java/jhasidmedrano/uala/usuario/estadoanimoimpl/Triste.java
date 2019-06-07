package jhasidmedrano.uala.usuario.estadoanimoimpl;

import jhasidmedrano.uala.producto.Producto;
import jhasidmedrano.uala.usuario.EstadoAnimo;

public class Triste implements EstadoAnimo{
	
	private final static int DURACION = 2;
	
	@Override
	public void recomedar(Producto producto) {
		if(producto.getDuracion() > DURACION) {
			System.out.println(producto.getTitulo());
		}
	}

}
