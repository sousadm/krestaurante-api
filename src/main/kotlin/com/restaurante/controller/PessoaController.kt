package com.restaurante.controller

import com.restaurante.model.PessoaModel
import com.restaurante.service.PessoaService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("pessoa")
class PessoaController(
    private val service: PessoaService
) {

    @GetMapping("/contato")
    fun mostra(): String {
        var valor = "<h1>Sousa</h1>"
        return valor
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun create(@RequestBody pessoa: PessoaModel): PessoaModel {
        return service.create(pessoa)
    }

    @PutMapping("/{p}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun update(@PathVariable p: PessoaModel, @RequestBody pessoa: PessoaModel): PessoaModel? {
//        return service.update(p.id, pessoa)
        return null
    }

    @GetMapping("/{id}")
    fun getCustomer(@PathVariable id: Int): PessoaModel {
        return service.getPessoa(id)
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.GONE)
    fun excluir(@PathVariable id: Int) {
        service.delete(id)
    }

    @GetMapping("/lista")
    fun listar(@RequestParam nome: String?): List<PessoaModel> {
        return service.getLista(nome)
    }

}