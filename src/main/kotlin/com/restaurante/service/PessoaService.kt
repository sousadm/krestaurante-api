package com.restaurante.service

import com.restaurante.controller.request.PessoaRequest
import com.restaurante.extension.toModel
import com.restaurante.extension.toResponse
import com.restaurante.model.primary.PessoaModel
import com.restaurante.repository.PessoaRepository
import org.springframework.stereotype.Service

@Service
class PessoaService(
    val repository: PessoaRepository
) {

    fun create(pessoa: PessoaRequest): PessoaModel {
        return this.repository.save(pessoa.toModel())
    }

    fun update(id: Long, pessoa: PessoaModel): PessoaRequest {
        if(id == null)
            throw Exception("informe o identificador do registro")
        pessoa.id = id
        return repository.save(pessoa).toResponse()
    }

    fun getPessoa(id: Long) : PessoaRequest {
        return this.repository.findById(id).orElseThrow().toResponse()
    }

    fun delete(id: Long) {
        if(!repository.existsById(id)){
            throw Exception()
        }
        repository.deleteById(id)
    }

    fun getLista(valor: String?): List<PessoaRequest> {
        valor?.let{
            return repository.findByNomeContaining(valor);
        }
        return repository.findAll().map { p -> p.toResponse() }
    }

}