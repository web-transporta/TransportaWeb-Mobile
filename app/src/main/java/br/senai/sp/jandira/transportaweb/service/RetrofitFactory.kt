package br.senai.sp.jandira.transportaweb.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitFactory {

    private val BASE_URL = "https://crud-03-09.onrender.com/"

    private val retrofitFactory = Retrofit
        .Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    // ********************************** MOTORISTA ********************************** //

    fun getMotoristaService(): MotoristaService {
        return retrofitFactory.create(MotoristaService::class.java)
    }

    fun postMotoristaService(): MotoristaService {
        return retrofitFactory.create(MotoristaService::class.java)
    }

    // ********************************** EMPRESA ********************************** //

    fun postEmpresaService(): EmpresaService {
        return retrofitFactory.create(EmpresaService::class.java)
    }

    fun getEmpresaService(): EmpresaService {
        return retrofitFactory.create(EmpresaService::class.java)
    }

    // ********************************** VIAGEM ********************************** //

    fun getViagemService(): ViagemService {
        return retrofitFactory.create(ViagemService::class.java)
    }

    // ********************************** VIACEP ********************************** //

    private val viaCepRetrofit = Retrofit
        .Builder()
        .baseUrl("https://viacep.com.br/ws/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    fun getViaCepService(): ViaCepService {
        return viaCepRetrofit.create(ViaCepService::class.java)
    }
}