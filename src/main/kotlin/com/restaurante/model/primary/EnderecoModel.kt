package com.restaurante.model.primary

import javax.persistence.*

@Entity(name = "endereco")
data class EnderecoModel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int,

    @Column(nullable = true, length = 100)
    var logradouro: String,

    @Column(nullable = true, length = 100)
    var bairro: String,

    @Column(nullable = true)
    var numero: Int,

    @Column(nullable = true, length = 8)
    var cep: String,

    @OneToOne
    var municipio: MunicipioModel,

    @ManyToOne
    var pessoa: PessoaModel

)
