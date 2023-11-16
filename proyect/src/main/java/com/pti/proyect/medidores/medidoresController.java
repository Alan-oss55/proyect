package com.pti.proyect.medidores;

import com.pti.proyect.medidores.medidoresModel;
import com.pti.proyect.medidores.medidoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/medidores")
public class medidoresController {
    @Autowired
    private medidoresService service;

    @GetMapping
    public ResponseEntity<List<medidoresModel>> list(){
        return ResponseEntity.ok().body(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
    
        	medidoresModel entidad = service.getMedidoresById(id);
        	return ResponseEntity.ok().body(entidad);       
    }

    @PostMapping
    public ResponseEntity<?> add(@RequestBody medidoresModel medidoresModel ) {
    	medidoresModel medidoresModel = service.addMedidores(medidoresModel);
            return ResponseEntity.ok().body(medidoresModel);
        
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody medidoresModel obj) {
      
    	medidoresModel medidoresModel = service.updateCiudadess(id, obj);
            return ResponseEntity.ok().body(medidoresModel);
        
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
        try {
            service.deleteMedidores(id);
            return ResponseEntity.ok().body("Eliminado exitosamente");;
        }
    }
}
