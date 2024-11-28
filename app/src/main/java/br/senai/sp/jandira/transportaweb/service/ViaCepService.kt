package br.senai.sp.jandira.transportaweb.service

import br.senai.sp.jandira.transportaweb.model.ViaCepResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path


    interface ViaCepService {
        @GET("{cep}/json/")
        fun buscarCep(@Path("cep") cep: String): Call<ViaCepResponse>
    }

