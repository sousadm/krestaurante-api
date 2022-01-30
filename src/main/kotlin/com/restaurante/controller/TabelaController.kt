package com.restaurante.controller

import com.restaurante.model.secondary.BancoModel
import com.restaurante.model.secondary.MunicipioModel
import com.restaurante.service.secondary.BancoService
import com.restaurante.service.secondary.MunicipioService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("tabela")
class TabelaController(
    private val municipioService: MunicipioService,
    private val bancoService: BancoService,
) {

    @GetMapping("/municipio")
    fun listarMunicipio(@RequestParam descricao: String?): List<MunicipioModel> {
        return municipioService.getLista(descricao)
    }

    @GetMapping("/bancos")
    fun listarBanco(@RequestParam descricao: String?): List<BancoModel> {
        return bancoService.getLista(descricao)
    }

}