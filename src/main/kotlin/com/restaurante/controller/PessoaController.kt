package com.restaurante.controller

import com.restaurante.model.primary.PessoaModel
import com.restaurante.controller.request.PessoaRequest
import com.restaurante.service.primary.PessoaService
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
    fun create(@RequestBody request: PessoaRequest): PessoaModel {
        return service.create(request)
    }

    @PutMapping("/{p}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    fun update(@PathVariable p: PessoaModel, @RequestBody pessoa: PessoaModel): PessoaModel? {
//        return service.update(p.id, pessoa)
        return null
    }

    @GetMapping("/{id}")
    fun getCustomer(@PathVariable id: Long): PessoaRequest {
        return service.getPessoa(id)
    }

    @DeleteMapping("{id}")
    @ResponseStatus(HttpStatus.GONE)
    fun excluir(@PathVariable id: Long) {
        service.delete(id)
    }

    @GetMapping("/lista")
    fun listar(@RequestParam nome: String?): List<PessoaRequest> {
        return service.getLista(nome)
    }

}