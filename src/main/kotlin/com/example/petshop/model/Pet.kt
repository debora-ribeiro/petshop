package com.example.petshop.model

import jakarta.persistence.*

@Entity
class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0
    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn(name ="dono_id")
    var dono: Dono? = null
    var idade: Int? = null
    var tipo: String? = null
    var genero: String? = null
    var raca: String? = null
}
