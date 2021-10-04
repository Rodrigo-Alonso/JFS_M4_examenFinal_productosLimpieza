package cl.edutecno.facade;

import java.util.List;

import cl.edutecno.dao.CategoriaDAO;
import cl.edutecno.dao.ProductoDAO;
import cl.edutecno.dao.UsuarioDAO;
import cl.edutecno.dto.CategoriaDTO;
import cl.edutecno.dto.ProductoDTO;
import cl.edutecno.dto.UsuarioDTO;

public class Facade {

	public int registrarProducto(ProductoDTO productoDTO) {
		ProductoDAO dao = new ProductoDAO();
		return dao.save(productoDTO);
	}

	public int actualizarProducto(ProductoDTO productoDTO) {

		ProductoDAO dao = new ProductoDAO();
		return dao.update(productoDTO);
	}

	public int borrarProducto(Integer id) {
		ProductoDAO dao = new ProductoDAO();
		return dao.delete(id);
	}

	public List<ProductoDTO> listarProductos() {
		ProductoDAO dao = new ProductoDAO();
		return dao.list();
	}

	@SuppressWarnings("static-access")
	public int registrarUsuario(UsuarioDTO usuarioDTO) {
		UsuarioDAO dao = new UsuarioDAO();
		return dao.save(usuarioDTO);
	}

	@SuppressWarnings("static-access")
	public int cambiarPassUsuario(UsuarioDTO usuarioDTO) {
		UsuarioDAO dao = new UsuarioDAO();
		return dao.update(usuarioDTO);
	}

	@SuppressWarnings("static-access")
	public UsuarioDTO obtenerUsuarioByEmail(String email) {
		UsuarioDAO dao = new UsuarioDAO();
		return dao.getRecordByEmail(email);
	}

	public List<CategoriaDTO> listarCategorias() {
		CategoriaDAO dao = new CategoriaDAO();
		return dao.list();
	}

	@SuppressWarnings("static-access")
	public ProductoDTO obtenerProductoById(Integer idProducto) {
		ProductoDAO dao = new ProductoDAO();
		return dao.getProductById(idProducto);
	}
}
