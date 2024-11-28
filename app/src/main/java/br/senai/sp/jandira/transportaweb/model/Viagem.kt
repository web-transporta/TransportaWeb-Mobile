package br.senai.sp.jandira.transportaweb.model

import java.time.LocalDate
import java.time.LocalTime

data class ViagemResponse(
    val motorista: List<Viagem>? = null,
    val status_code: Int
)

data class Viagem(
    val id: Int,
    val id_viagem: String,
    val dia_partida: String,
    val horario_partida: String,
    val dia_chegada: String,
    val remetente: String,
    val destinatario: String,
    val status_entregue: Int,
    val partida_cep: String,
    val destino_cep: String,
    val motorista_nome: String,
    val veiculo_modelo: String,
    val tipo_carga_nome: String,
    val empresa_nome: String
)