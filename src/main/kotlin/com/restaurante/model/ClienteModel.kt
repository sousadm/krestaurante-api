package com.restaurante.model

import javax.persistence.*

@Entity(name = "cliente")
data class ClienteModel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @OneToOne
    @JoinColumn(name = "pessoa_id")
    var pessoa: PessoaModel

)
