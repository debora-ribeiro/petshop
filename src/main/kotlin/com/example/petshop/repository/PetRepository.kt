package com.example.petshop.repository

import com.example.petshop.model.Pet
import org.springframework.data.jpa.repository.JpaRepository



interface PetRepository: JpaRepository<Pet, Long> {


}