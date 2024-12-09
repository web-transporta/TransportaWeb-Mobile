package br.senai.sp.jandira.transportaweb

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.transportaweb.model.LoginMotorista
import br.senai.sp.jandira.transportaweb.screens.LoginM
import br.senai.sp.jandira.transportaweb.screens.empresas.CadastroE
import br.senai.sp.jandira.transportaweb.screens.empresas.DetalhesViagensE
import br.senai.sp.jandira.transportaweb.screens.empresas.LoginE
import br.senai.sp.jandira.transportaweb.screens.geral.ChatSreen
import br.senai.sp.jandira.transportaweb.screens.geral.Contatos
import br.senai.sp.jandira.transportaweb.screens.motoristas.CadastroM
import br.senai.sp.jandira.transportaweb.screens.motoristas.DetalhesViagensM
import br.senai.sp.jandira.transportaweb.screens.motoristas.HomeM
//import br.senai.sp.jandira.transportaweb.screens.motoristas.HomeM
import br.senai.sp.jandira.transportaweb.screens.motoristas.PerfilH
import br.senai.sp.jandira.transportaweb.screens.motoristas.TelaViagens
import br.senai.sp.jandira.transportaweb.ui.theme.TransportaWebTheme

class   MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TransportaWebTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val controleNavegacao = rememberNavController()
                    NavHost(navController = controleNavegacao,
                        startDestination = "contatos"
                    ){
                        // ********************************** MOTORISTA ********************************** //

                        composable(route = "cadastroMotorista"){ CadastroM(controleNavegacao) }
                        composable(route = "loginMotorista"){ LoginM(controleNavegacao) }
                        composable(route = "homeMotorista") { HomeM(controleNavegacao) }
                        composable(route = "perfilMotorista"){ PerfilH(controleNavegacao) }
                        composable(route = "detalhesViagensMotorista"){DetalhesViagensM(controleNavegacao)}

                        // ********************************** EMPRESA ********************************** //
                        composable(route = "cadastroeEmpresa"){ CadastroE(controleNavegacao) }
                        composable(route = "loginEmpresa"){ LoginE(controleNavegacao) }
                        composable(route = "detalhesViagensEmpresa"){DetalhesViagensE(controleNavegacao)}
                        composable(route = "telaViagens"){ TelaViagens(controleNavegacao) }

                        // ********************************** GERAL ********************************** //

                        composable(route = "chatScreen"){ ChatSreen(controleNavegacao)}
                        composable(route = "contatos"){ Contatos(controleNavegacao) }
                    }

                }
            }
        }
    }
}