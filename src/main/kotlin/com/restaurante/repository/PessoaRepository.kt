package com.restaurante.repository

import com.restaurante.model.PessoaModel
import org.springframework.data.repository.CrudRepository

interface PessoaRepository : CrudRepository<PessoaModel, Int> {

    fun findByNomeContaining(nome: String): List<PessoaModel>

}