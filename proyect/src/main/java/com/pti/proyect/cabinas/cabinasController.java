package com.pti.proyect.cabinas;


import com.pti.proyect.cabinas.cabinasModel;
import com.pti.proyect.cabinas.cabinasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/departamentos")
public class cabinasController {

    @Autowired
    private cabinasService service;

    @GetMapping
    public ResponseEntity<List<cabinasModel>> list(){
        return ResponseEntity.ok().body(service.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id){
            cabinasModel nombre = service.getDepartamentosById(id);
            return ResponseEntity.ok().body(nombre);
        }
    

    @PostMapping
    public ResponseEntity<?> add(@RequestBody cabinasModel Cabinasmodel ) {
            cabinasModel cabinasAdd = service.addCabinas(Cabinasmodel);
            return ResponseEntity.ok().body(cabinasAdd);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Long id, @RequestBody cabinasModel obj) {
            cabinasModel CabinasModel = service.addCabinas(id, obj);
            return ResponseEntity.ok().body(CabinasModel);
        }
    

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Long id) {
    
            service.deleteCabinas(id);
            return ResponseEntity.ok().body("Eliminado exitosamente");
    }
     
    }

}
