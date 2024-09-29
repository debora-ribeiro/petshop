package com.example.petshop.controller

import com.example.petshop.model.Dono
import com.example.petshop.sevice.DonoService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/dono")
class DonoController(val donoService: DonoService) {
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    fun cadastrar(@RequestBody dono: Dono): Dono {
        val novoDono = donoService.cadastrar(dono)
        return novoDono}

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    fun buscarPorId(@PathVariable id: Long): Dono {
        val dono = donoService.buscarPorId(id)
        return dono
    }

}