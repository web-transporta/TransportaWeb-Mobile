package br.senai.sp.jandira.transportaweb.model

import androidx.compose.ui.graphics.painter.Painter

data class Cards(
    val id: Int = 0,
    val nome: String = "",
    var imagem: Painter? = null
)
