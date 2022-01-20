package com.restaurante.extension

import com.restaurante.controller.request.PessoaRequest
import com.restaurante.model.primary.PessoaModel

fun PessoaRequest.toModel() : PessoaModel {
    return PessoaModel(
        id = this.id,
        nome = this.nome,
        email = this.email,
        celular = this.celular
    )
}

fun PessoaModel.toResponse() : PessoaRequest {
    return PessoaRequest(
        id = this.id,
        nome = this.nome,
        celular = this.celular,
        email = this.email
    )
}