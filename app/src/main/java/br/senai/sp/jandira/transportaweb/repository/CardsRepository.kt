package br.senai.sp.jandira.transportaweb.repository

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import br.senai.sp.jandira.transportaweb.model.Cards

class CardsRepository {

    @Composable
    fun listarTodosOsCards(): List<Cards> {
        val historico = Cards(
            id = 1,
            nome = "Historico",
            imagem = null
        )

        val viagens = Cards(
            id = 1,
            nome = "Viagens",
            imagem = null
        )

        val equipe = Cards(
            id = 1,
            nome = "Equipe",
            imagem = null
        )

        return listOf(historico, equipe, viagens)
    }
}