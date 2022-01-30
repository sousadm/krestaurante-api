package com.restaurante.service.secondary

import com.restaurante.model.secondary.MunicipioModel
import com.restaurante.repository.secondary.MunicipioRepository
import org.springframework.stereotype.Service

@Service
class MunicipioService(
    val repository: MunicipioRepository
) {

    fun getLista(valor: String?): List<MunicipioModel> {
        valor?.let{
            return repository.findByDescricaoIgnoreCaseContaining(valor);
        }
        return repository.findAll().toList()
    }

}