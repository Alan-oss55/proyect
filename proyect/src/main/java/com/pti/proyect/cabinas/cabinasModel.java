package com.pti.proyect.cabinas;

import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "caibnas")
@Data
//    @OneToMany
//    private  ;
public class cabinasModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String nombre;

    @Column
    private String url;



}
