package com.restaurante.extension

import com.restaurante.controller.request.PessoaRequest
import com.restaurante.model.PessoaModel

fun PessoaRequest.toModel() : PessoaModel {
    return PessoaModel(nome = this.nome, email = this.email, celular = this.celular)
}