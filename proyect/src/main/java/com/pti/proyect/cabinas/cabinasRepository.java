package com.pti.proyect.cabinas;

import com.pti.proyect.cabinas.cabinasModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface cabinasRepository extends JpaRepository<cabinasModel, Long> {
}
