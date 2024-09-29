package com.example.petshop.model

import jakarta.persistence.FetchType
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne

class PetDto {
    val donoID: Long = 0
    val idade: Int? = null
    val tipo: String? = null
    val genero: String? = null
    val raca: String? = null
}