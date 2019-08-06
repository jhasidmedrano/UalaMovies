package jhsidmedrano.uala;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Matchers.anyObject;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import jhasidmedrano.uala.producto.Pelicula;
import jhasidmedrano.uala.producto.Producto;
import jhasidmedrano.uala.usuario.Usuario;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UsuarioTest {

	@InjectMocks
	private Usuario juan;

	@Mock
	private Usuario pablo;
	private Producto laMascaraDelZorro = new Producto();
	private Producto capitanaMarvel = new Producto();

	@Before
	public void setUp() {
		juan = new Usuario();
		pablo = new Usuario();
		laMascaraDelZorro = new Producto(LocalDate.of(1998,10,10), 120, "La mascara del zorro");
		capitanaMarvel = new Pelicula(LocalDate.of(2019, 10, 10), 120, "Capitana Marvel");
	}

	@Test
	public void testUsuarioAntiguo() {
		juan.setProductoVisto(laMascaraDelZorro);
		assertTrue(juan.isAntiguo());
	}
	
	@Test
	public void testUsuarioNoAntiguo() {
		juan.setProductoVisto(capitanaMarvel);
		assertFalse(juan.isAntiguo());
	}

	@Test
	public void testUsuarioMiraProductoInteresante() {
		juan.setProductoVisto(capitanaMarvel);
		assertEquals(true, juan.isMirandoProductoInteresante());
	}

	@Test
	public void testUsuarioMiraProductoInteresanteMock() {
		when(pablo.isMirandoProductoInteresante()).thenReturn(false);
		assertEquals(true, pablo.isMirandoProductoInteresante());
	}
	
	@Test
	public void testUsuarioNoMiraProductoInteresante() {
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
