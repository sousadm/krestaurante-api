package com.restaurante.service

import com.restaurante.controller.request.PessoaRequest
import com.restaurante.extension.toModel
import com.restaurante.model.PessoaModel
import com.restaurante.repository.PessoaRepository
import org.springframework.stereotype.Service

@Service
class PessoaService(
    val repository: PessoaRepository
) {

    fun create(pessoa: PessoaRequest): PessoaModel{
        return this.repository.save(pessoa.toModel())
    }

    fun update(id: Int, pessoa: PessoaModel): PessoaModel {
        if(id == null){
            throw Exception()
        }
        pessoa.id = id
        return repository.save(pessoa)
    }

    fun getPessoa(id: Int) : PessoaModel {
        return this.repository.findById(id).orElseThrow()
    }

    fun delete(id: Int) {
        if(!repository.existsById(id)){
            throw Exception()
        }
        repository.deleteById(id)
    }

    fun getLista(valor: String?): List<PessoaModel> {
        valor?.let{
            return repository.findByNomeContaining(valor)
        }
        return repository.findAll().toList()
    }

}