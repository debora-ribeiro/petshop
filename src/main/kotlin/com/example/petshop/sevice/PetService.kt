package com.example.petshop.sevice

import com.example.petshop.model.Pet
import com.example.petshop.model.PetDto
import com.example.petshop.model.Petview
import com.example.petshop.repository.DonoRepository
import com.example.petshop.repository.PetRepository
import org.springframework.data.jpa.domain.AbstractPersistable_.id
import org.springframework.stereotype.Service
import java.util.*

@Service
class PetService (private val petRepository: PetRepository,private val donoRepository: DonoRepository) {
    fun cadastrar(petDto: PetDto): Petview {
        print("qualquer coisa")
        print(petDto.donoID)
        val dono = donoRepository.findById(petDto.donoID).get()
        var pet = Pet()
        pet.genero = petDto.genero
        pet.raca = petDto.raca
        pet.idade = petDto.idade
        pet.tipo = petDto.tipo
        pet.dono = dono
        val novoPet = petRepository.save(pet)
        var novoPetDto = Petview()
        novoPetDto.genero = novoPet.genero
        novoPetDto.raca = novoPet.raca
        novoPetDto.idade = novoPet.idade
        novoPetDto.tipo = novoPet.tipo
        novoPetDto.dono = dono.nome
        return novoPetDto
    }

    fun buscarPorId(id: Long): Petview {
        var pet = petRepository.findById(id).get()
        var novoPetDto = Petview()
        novoPetDto.genero = pet.genero
        novoPetDto.raca = pet.raca
        novoPetDto.idade = pet.idade
        novoPetDto.tipo = pet.tipo
        novoPetDto.dono = pet.dono?.nome
        return novoPetDto
    }
}