package com.pti.proyect.medidores;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class medidoresModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String serial;

    @Column
    private Integer id_cabina;
    
    @ManyToOne
    @JoinColumn(name = "id_cabina")
    private cabinasModel CabinasModel;
}