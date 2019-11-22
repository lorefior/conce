package com.escuela.usuario.valido;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface VehiculoRepository extends JpaRepository<Vehiculo, Long> {

    List<Vehiculo> findAllByMarcaLike(String marca);

   // List<Vehiculo> findAllByMarcaLikeOrModeloLike(String marca, String modelo);

	List<Vehiculo> findAllByMarcaLikeOrModeloLike(String marca, String modelo);



}
