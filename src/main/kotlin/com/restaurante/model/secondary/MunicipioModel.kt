package com.restaurante.model.secondary

import javax.persistence.*

@Entity(name = "municipio")
data class MunicipioModel(

    @Id
    var id: Long,

    @Column(nullable = true, length = 100)
    var descricao: String,

    @Column(nullable = true, length = 10)
    var uf: String,
    
)
