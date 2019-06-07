package jhasidmedrano.uala.usuario.estadoanimoimpl;

import jhasidmedrano.uala.producto.Producto;
import jhasidmedrano.uala.usuario.EstadoAnimo;

public class Contento implements EstadoAnimo{

	@Override
	public void recomedar(Producto producto) {
		System.out.println(producto.getTitulo());
	}

}
