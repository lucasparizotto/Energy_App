package com.example.energyapp.repository

import com.example.energyapp.model.Geradora

fun getAllGeradoras(): List<Geradora> {
    return listOf(
        Geradora(1,"Ambar","Solar", 1000, "Santinho"),
        Geradora(2,"Cooperativa Terenas","Solar", 2400, "Ibaté"),
        Geradora(3,"Cooperativa Terenas","Solar", 3625, "São Carlos"),
        Geradora(4,"Consócio Soluo","Solar", 960, "Piracicaba"),
        Geradora(5,"Consócio Liberty","Solar", 5000, "Barra do Quaraí"),
        Geradora(6,"Cooperativa Nacional Flora","Hidráulica", 682, "Cajuru"),
        Geradora(7,"Solar Gold","Solar", 1000, "Monte Aprazível"),
        Geradora(8,"Cooperativa Brasileira","Hidráulica", 950, "Vacaria"),
        Geradora(9,"Cooperativa NEX","Solar", 2000, "Cafelandia")
    )
}

fun getGeradoraByNome(nome: String): List<Geradora> {
    return getAllGeradoras().filter {
        it.nome.startsWith(prefix = nome, ignoreCase = true)
    }
}