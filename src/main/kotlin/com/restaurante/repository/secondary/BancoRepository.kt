package com.restaurante.repository.secondary

import com.restaurante.model.secondary.BancoModel
import org.springframework.data.repository.CrudRepository

interface BancoRepository : CrudRepository<BancoModel, Long> {

    fun findByDescricaoIgnoreCaseContainingOrCodigoEquals(valor: String): List<BancoModel>

}