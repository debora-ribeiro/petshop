package com.example.petshop.sevice

import com.example.petshop.model.Dono
import com.example.petshop.repository.DonoRepository
import org.springframework.stereotype.Service

@Service
class DonoService (private val donoRepository: DonoRepository) {
    fun cadastrar(dono: Dono): Dono {
        val novoDono = donoRepository.save(dono)
        return novoDono
    }

    fun buscarPorId(id: Long): Dono {
        return donoRepository.findById(id).get()
    }
}
