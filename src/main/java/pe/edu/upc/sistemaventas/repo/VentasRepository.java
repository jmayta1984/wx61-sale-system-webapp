package pe.edu.upc.sistemaventas.repo;

import org.springframework.data.repository.CrudRepository;

import pe.edu.upc.sistemaventas.model.Venta;

public interface VentasRepository extends CrudRepository<Venta, Integer> {
}
