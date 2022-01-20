package com.restaurante.controller.request

data class PessoaRequest (
        var id: Long?,
        var nome: String,
        var celular: String,
        var email: String
        )