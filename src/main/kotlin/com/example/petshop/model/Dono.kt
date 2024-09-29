package com.example.petshop.model

import jakarta.persistence.*

@Entity
class Dono {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
    val nome: String? = null
    val contato: String? = null
    val endereco: String? = null
    @OneToMany(mappedBy = "dono", fetch = FetchType.LAZY, cascade = [CascadeType.ALL] )
    val pets: List<Pet>? = null

}
