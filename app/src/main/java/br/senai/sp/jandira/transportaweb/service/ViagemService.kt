package br.senai.sp.jandira.transportaweb.service

import br.senai.sp.jandira.transportaweb.model.Viagem
import br.senai.sp.jandira.transportaweb.model.ViagemResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ViagemService {

    @GET("v1/transportaweb/viagens")
    fun getListarViagens(): Call<List<Viagem>>

    @GET("v1/transportaweb/viagem/{id}")
    fun getViagemById(@Path("id") id: Int): Call<ViagemResponse>

}

