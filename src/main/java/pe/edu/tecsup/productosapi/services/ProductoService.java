package pe.edu.tecsup.productosapi.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.tecsup.productosapi.models.Producto;
import pe.edu.tecsup.productosapi.repositories.ProductoRepository;
@Service
public class ProductoService {

	@Autowired
	private ProductoRepository productoRepository;
	
	public List<Producto> listar(){
		return productoRepository.listar();
	}
	public void crear(Producto producto) {
		productoRepository.crear(producto);
	}
	public void eliminar(Integer id) {
		productoRepository.eliminar(id);
	}

	public Producto obtener(Integer id) {
		return productoRepository.obtener(id);
	}

}
