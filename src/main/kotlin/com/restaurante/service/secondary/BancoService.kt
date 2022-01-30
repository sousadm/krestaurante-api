package com.restaurante.service.secondary

import com.restaurante.model.secondary.BancoModel
import com.restaurante.repository.secondary.BancoRepository
import org.springframework.stereotype.Service

@Service
class BancoService(
    val repository: BancoRepository
) {

    fun getLista(valor: String?): List<BancoModel> {
        valor?.let{
            return repository.findByDescricaoIgnoreCaseContainingOrCodigoEquals(valor);
        }
        return repository.findAll().toList()
    }

}