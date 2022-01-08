package com.restaurante.model

import com.restaurante.enums.TipoPessoa
import javax.persistence.*

@Entity(name = "pessoa")
data class PessoaModel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column(nullable = true, length = 100)
    var nome: String,

    @Column(unique = true, length = 255)
    var email: String,

    @Column(length = 20)
    var celular: String?,

    @Column
    @Enumerated(EnumType.STRING)
    var tipo: TipoPessoa = TipoPessoa.FISICA

)