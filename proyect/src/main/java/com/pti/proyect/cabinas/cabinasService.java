package com.pti.proyect.cabinas;


import com.pti.proyect.cabinas.cabinasModel;
import com.pti.proyect.cabinas.cabinasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class cabinasService {

    @Autowired
    private cabinasRepository repository;

    //Lista todas las cabinas
    public List<cabinasModel> getAll(){
        return repository.findAll();
    }

    //Obtiene por Id la cabina
    public cabinasModel getDepartamentosById(Long id){
        Optional<cabinasModel> Departamentos = repository.findById(id);
        return Departamentos.orElseGet(cabinasModel::new);
    }

    //Crea una nueva cabina
    public cabinasModel addCabinas(cabinasModel cabinaModel){
        return repository.save(cabinasModel);
    }

    //Actualiza la cabina
    public cabinasModel updateCabinas(Long id, cabinasModel cabinasModel){
        Optional<cabinasModel> opt = repository.findById(id);
        if(opt.isEmpty()){
            throw new RuntimeException(String.format("El Departamento con el id %s no fue encontrado", id));
        }
        cabinasModel.equals(id);
        return  repository.save(cabinasModel);
    }

    //Elimina por Id
    public void deleteDepartamentos(Long id){
        Optional<cabinasModel> opt = repository.findById(id);
        if(opt.isEmpty()){
            throw new RuntimeException(String.format("El departamento con el id %s no fue encontrado", id));
        }
        repository.deleteById(id);
    }
}

