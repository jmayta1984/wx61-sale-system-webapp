package pe.edu.upc.sistemaventas.repo;

import org.springframework.data.repository.CrudRepository;

import pe.edu.upc.sistemaventas.model.Producto;

public interface ProductosRepository extends CrudRepository<Producto, Integer> {

    Producto findFirstByCodigo(String codigo);
}
