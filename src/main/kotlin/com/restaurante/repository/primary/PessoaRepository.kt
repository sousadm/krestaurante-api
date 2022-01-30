package com.restaurante.repository.primary

import com.restaurante.controller.request.PessoaRequest
import com.restaurante.model.primary.PessoaModel
import org.springframework.data.repository.CrudRepository

interface PessoaRepository : CrudRepository<PessoaModel, Long> {

    fun findByNomeContaining(nome: String): List<PessoaRequest>

}