package com.example.petshop.controller

import com.example.petshop.model.Pet
import com.example.petshop.model.PetDto
import com.example.petshop.model.Petview
import com.example.petshop.sevice.PetService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/pet")
class PetController (val petService: PetService) {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun cadastrar(@RequestBody pet: PetDto): Petview {
        val novoPet = petService.cadastrar(pet)
        return novoPet
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun buscarPorId(@PathVariable id: Long): Petview {
        val pet = petService.buscarPorId(id)
        return pet
    }
}