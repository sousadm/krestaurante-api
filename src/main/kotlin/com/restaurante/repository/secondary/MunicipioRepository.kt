package com.restaurante.repository.secondary

import com.restaurante.model.secondary.MunicipioModel
import org.springframework.data.repository.CrudRepository

interface MunicipioRepository : CrudRepository<MunicipioModel, Long> {

    fun findByDescricaoIgnoreCaseContaining(valor: String): List<MunicipioModel>

}