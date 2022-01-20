package com.restaurante.model.primary

import com.restaurante.enums.TipoPessoa
import java.time.LocalDate
import javax.persistence.*

@Entity(name = "pessoa")
data class PessoaModel(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long?,

    @Column(nullable = true, length = 100)
    var nome: String,

    @Column(unique = true, length = 255)
    var email: String,

    @Column(length = 20)
    var celular: String,

    @Column
    @Enumerated(EnumType.STRING)
    var tipo: TipoPessoa = TipoPessoa.FISICA,

    @Column(nullable = false)
    var created_dt: LocalDate = LocalDate.now(),

    @Column(nullable = false)
    var update_dt: LocalDate? = null,

    @OneToMany(mappedBy = "pessoa", orphanRemoval = true)
    var enderecos: MutableSet<EnderecoModel> = mutableSetOf()

)