package jhasidmedrano.uala.usuario.estadoanimoimpl;

import java.time.LocalDate;

import jhasidmedrano.uala.producto.Producto;
import jhasidmedrano.uala.usuario.EstadoAnimo;

public class Melancolico implements EstadoAnimo{

	@Override
	public void recomedar(Producto producto) {
		LocalDate date = LocalDate.now();
		//TODO JMEDRANO: Peliculmas mayores a 10 anios
		System.out.println("Pendiente de implementacionS");
	}

}
