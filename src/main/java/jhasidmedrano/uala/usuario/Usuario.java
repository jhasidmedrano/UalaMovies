package jhasidmedrano.uala.usuario;

import java.util.Date;
import java.util.HashMap;

import jhasidmedrano.uala.canalcomunicacion.CanalComunicacionEnum;
import jhasidmedrano.uala.producto.Producto;

public class Usuario {
	
	private HashMap<CanalComunicacionEnum, String> canalesComunicacion = new HashMap<>();
	private Date fechaSuscripcion;
	private Producto productoVisto;
	private long credito = 0;
	private AnimoUsuario animoUsuario;
	
	
	public HashMap<CanalComunicacionEnum, String> getCanalesComunicacion() {
		return canalesComunicacion;
	}

	public void setCanalesComunicacion(HashMap<CanalComunicacionEnum, String> canalesComunicacion) {
		this.canalesComunicacion = canalesComunicacion;
	}

	public Date getFechaSuscripcion() {
		return fechaSuscripcion;
	}

	public void setFechaSuscripcion(Date fechaSuscripcion) {
		this.fechaSuscripcion = fechaSuscripcion;
	}

	public Producto getProductoVisto() {
		return productoVisto;
	}

	public void setProductoVisto(Producto productoVisto) {
		this.productoVisto = productoVisto;
	}

	public long getCredito() {
		return credito;
	}

	public void setCredito(long credito) {
		this.credito = credito;
	}
	
	public void addCanalesComunicacion(CanalComunicacionEnum canalComunicacion) {
		this.canalesComunicacion.put(canalComunicacion, canalComunicacion.name());
	}

	public void removeCanalesComunicacion(CanalComunicacionEnum canalComunicacion) {
		this.canalesComunicacion.remove(canalComunicacion);
	}
	
	public void suscribirse() {
		//TODO JMEDRANO:
	}

	public void recomendarProducto(Producto producto) {
		animoUsuario.recomendar(producto);		
	}

	public void estadoTriste() {
		animoUsuario.triste();
	}

	public void estadoContento() {
		animoUsuario.contento();
	}

	public void estadoMelancolico() {
		animoUsuario.melancolico();
	}
	
	public boolean isAntiguo() {
		return productoVisto.isViejo();
	}
	
	public boolean isMirandoProductoInteresante() {
		return productoVisto.isInteresante();
	}
	




}
