package com.pti.proyect.medidores;

import com.pti.proyect.medidores.medidoresModel;
import com.pti.proyect.medidores.medidoresRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class medidoresService {
    
    @Autowired
    private medidoresRepository repository;

    //Lista todos los medidores
    public List<medidoresModel> getAll(){
        return repository.findAll();
    }

    //Obtiene por Id el medidor
    public medidoresModel getMeidoresById(Long id){
        Optional<medidoresModel> medidoresModel = repository.findById(id);
        return medidoresModel.orElseGet(medidoresModel::new);
    }

    //Crea un nuevo medidor
    public medidoresModel addMedidores(medidoresModel medidoresModel){
        return repository.save(medidoresModel);
    }

    //Actualiza el medidor
    public medidoresModel updateCiudadess(Long id, medidoresModel medidoresModel){
        Optional<medidoresModel> opt = repository.findById(id);
        if(opt.isEmpty()){
            throw new RuntimeException(String.format("El medidor con el id %s no fue encontrado", id));
        }
        medidoresModel.setId(id);
        return  repository.save(medidoresModel);
    }

    //Elimina por Id
    public void deleteMedidores(Long id){
        Optional<medidoresModel> opt = repository.findById(id);
        if(opt.isEmpty()){
            throw new RuntimeException(String.format("El medidor con el id %s no fue encontrado", id));
        }
        repository.deleteById(id);
    }
}

