package com.example.petshop.repository

import com.example.petshop.model.Dono
import org.springframework.data.jpa.repository.JpaRepository

interface DonoRepository: JpaRepository<Dono,Long>{

}