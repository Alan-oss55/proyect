package com.pti.proyect.medidores;


import com.pti.proyect.medidores.medidoresModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface medidoresRepository extends JpaRepository<medidoresModel, Long> {
}
