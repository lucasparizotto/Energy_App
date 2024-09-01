package com.example.energyapp.model

data class Geradora(
    val id: Long = 0,
    val nome: String = "",
    val modalidadeGeracao: String = "",
    val potenciaGeracao: Long = 0,
    val localizacao: String = ""
    )