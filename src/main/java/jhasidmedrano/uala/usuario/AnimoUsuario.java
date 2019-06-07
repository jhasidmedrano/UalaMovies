package jhasidmedrano.uala.usuario;

import jhasidmedrano.uala.producto.Producto;
import jhasidmedrano.uala.usuario.estadoanimoimpl.Contento;
import jhasidmedrano.uala.usuario.estadoanimoimpl.Melancolico;
import jhasidmedrano.uala.usuario.estadoanimoimpl.Triste;

public class AnimoUsuario {

	private EstadoAnimo estadoAnimo;
	
	public void triste() {
		estadoAnimo = new Triste();
	}

	public void contento() {
		estadoAnimo = new Contento();		
	}

	public void melancolico() {
		estadoAnimo = new Melancolico();
	}
	
	public void recomendar(Producto producto) {
		estadoAnimo.recomedar(producto);
	}


}
