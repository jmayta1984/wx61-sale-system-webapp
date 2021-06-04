package pe.edu.upc.sistemaventas.repo;

import org.springframework.data.repository.CrudRepository;

import pe.edu.upc.sistemaventas.model.ProductoVendido;

public interface ProductosVendidosRepository extends CrudRepository<ProductoVendido, Integer> {

}
