package com.restaurante.model.secondary

import javax.persistence.*

@Entity(name = "banco")
data class BancoModel(

    @Id
    var codigo: String,

    @Column(nullable = true, length = 100)
    var descricao: String
    
)
