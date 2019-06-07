package jhsidmedrano.uala;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import jhasidmedrano.uala.producto.Pelicula;
import jhasidmedrano.uala.producto.Producto;
import jhasidmedrano.uala.usuario.Usuario;

public class UsuarioTest {
	
	private Usuario juan = null;
	private Usuario pablo = null;
	private Usuario pedro = null;
	
	@Before
	public void setUp() {
		juan = new Usuario();
		pablo = new Usuario();
		pedro = new Usuario();
		
		//PENDING JMEDRANO:
		//Generar un lista de productos variados
	}
	

	@Test
	public void testUsuarioAntiguo() {
		Producto laMascaraDelZorro = new Pelicula(LocalDate.of(2010, 10, 10), 120, "La mascara del Zorro");
		juan.setProductoVisto(laMascaraDelZorro);
		Assert.assertEquals(true, juan.isAntiguo());
		
	}
	
	@Test
	public void testUsuarioNoAntiguo() {
		Producto capitanaMarvel = new Pelicula(LocalDate.of(2019, 10, 10), 120, "Capitana Marvel");
		juan.setProductoVisto(capitanaMarvel);
		Assert.assertEquals(false, juan.isAntiguo());
	}

	@Test
	public void testUsuarioMiraProductoInteresante() {
		//PENDING TEST
		Assert.assertEquals(true, pablo.isMirandoProductoInteresante());
	}
	
	@Test
	public void testUsuarioNoMiraProductoInteresante() {
		//PENDING TEST
		Assert.assertEquals(false, pablo.isMirandoProductoInteresante());
	}
	
	@Test
	public void testRecomendacionesUsuarioTriste() {
		//PENDING JMEDRANO : TEST
		//Crear un cliente 
		//Agregar un estado
		//Mockear un lista de productos
		//Ver si me recomienda una pelicula
//		Assert.assertEquals(true, pedro.recomendarProducto(null));
	}
	
	@Test
	public void testRecomendacionesUsuarioMelancolico() {
//		Assert.assertEquals(false, pedro.recomendarProducto(null));
	}

	@Test
	public void testRecomendacionesUsuarioContento() {
//		Assert.assertEquals(false, pedro.recomendarProducto(null));
	}
	



}
