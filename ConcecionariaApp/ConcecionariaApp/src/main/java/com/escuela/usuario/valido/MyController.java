package com.escuela.usuario.valido;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MyController {

	@Autowired
    VehiculoRepository vehiculoRepository;

    @GetMapping("/vehiculo")
    public List<Vehiculo> getAllVehiculo() {
        return vehiculoRepository.findAll();
    }

//    @GetMapping("/vehiculo/{id}")
//   public Optional<Vehiculo> getAllVehiculo(@PathVariable int id) {
//        return vehiculoRepository.findById(id);
//    }

    @GetMapping("/vehiculo/search/{marca}")
    public List<Vehiculo> getAlumnosByName(@PathVariable String marca) {
        return vehiculoRepository.findAllByMarcaLike("%"+marca+"%");
    }

    @GetMapping("/vehiculo/search2/{marca}")
    public List<Vehiculo> getAlumnosByMarcaAndModelo(@PathVariable String marca) {
        return vehiculoRepository.findAllByMarcaLikeOrModeloLike("%"+marca+"%", "%"+marca+"%");
    }


    @PostMapping("/vehiculo/add")
    public Vehiculo create(@RequestBody Vehiculo body) {
        return vehiculoRepository.save(body);
    }

    @PutMapping("/vehiculo/")
    public Vehiculo update(@RequestBody Vehiculo body) {
        return vehiculoRepository.save(body);
    }

//	@DeleteMapping("/vehiculo/{idvehiculo}")
//	public Vehiculo delete(@PathVariable int id) {
//		Optional<Vehiculo> al = vehiculoRepository.findById(id);
//		if (al.isPresent()) {
//			vehiculoRepository.delete(al.get());
//			return al.get();
//		} else {
//			return null;
//		}
//	}

}
