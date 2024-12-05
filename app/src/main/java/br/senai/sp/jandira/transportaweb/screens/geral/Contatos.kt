package br.senai.sp.jandira.transportaweb.screens.geral

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.transportaweb.R

@Composable
fun Contatos(controleDeNavegacao: NavHostController) {

    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = Color(0xFFC00000)
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 20.dp, start = 24.dp)
        ){
            Image(
                painterResource(R.drawable.botaob),
                contentDescription = "Logo",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(50.dp)
            )
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .padding(start = 12.dp)
                    .height(50.dp)
            ){
                Text(
                    text = "Contatos",
                    color = Color.White,
                    fontSize = 24.sp
                )
            }
        }
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(top = 130.dp)
                .background(
                    Color.White, shape =
                    RoundedCornerShape(topStart = 36.dp, topEnd = 36.dp)
                )
        ) {
            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(24.dp)
            ){
                Text(
                    text = "Conversas recentes",
                    fontSize = 24.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color(0xFF3A3A3A)
                )

                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 20.dp)
                ){
                    Image(
                        painterResource(R.drawable.usuario),
                        contentDescription = "Logo",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(50.dp)
                    )
                    Column (
                        verticalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier
                            .padding(start = 10.dp)
                            .height(50.dp)
                    ){
                        Text(
                            text = "Pedro",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = "Sei lá o que ponto ponto ponto",
                            fontSize = 14.sp,
                        )
                    }
                }
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ){
                    Image(
                        painterResource(R.drawable.usuario),
                        contentDescription = "Logo",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(50.dp)
                    )
                    Column (
                        verticalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier
                            .padding(start = 10.dp)
                            .height(50.dp)
                    ){
                        Text(
                            text = "Pedro",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = "Sei lá o que ponto ponto ponto",
                            fontSize = 14.sp,
                        )
                    }
                }
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ){
                    Image(
                        painterResource(R.drawable.usuario),
                        contentDescription = "Logo",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(50.dp)
                    )
                    Column (
                        verticalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier
                            .padding(start = 10.dp)
                            .height(50.dp)
                    ){
                        Text(
                            text = "Pedro",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = "Sei lá o que ponto ponto ponto",
                            fontSize = 14.sp,
                        )
                    }
                }
                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp)
                ){
                    Image(
                        painterResource(R.drawable.usuario),
                        contentDescription = "Logo",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(50.dp)
                    )
                    Column (
                        verticalArrangement = Arrangement.SpaceEvenly,
                        modifier = Modifier
                            .padding(start = 10.dp)
                            .height(50.dp)
                    ){
                        Text(
                            text = "Pedro",
                            fontSize = 16.sp,
                            fontWeight = FontWeight.SemiBold
                        )
                        Text(
                            text = "Sei lá o que ponto ponto ponto",
                            fontSize = 14.sp,
                        )
                    }
                }
            }
        }
        Box(
            modifier = Modifier
                .padding(top = 760.dp)
                .background(
                    color = Color(0xFFFFFFFF), shape =
                    RoundedCornerShape(topStart = 36.dp, topEnd = 36.dp)
                )
        ){
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .padding(start = 20.dp, top = 10.dp, end = 20.dp),
                horizontalArrangement = Arrangement.SpaceAround
            ){
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    Image(
                        painterResource(R.drawable.home),
                        contentDescription = "Home",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(42.dp)
                            .padding(start = 0.dp)
                    )
                    Text(
                        text = "Home",
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFFF61221)
                    )
                }
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    Image(
                        painterResource(R.drawable.caminhao),
                        contentDescription = "Caminhao",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(40.dp)
                            .padding(start = 0.dp)
                    )
                    Text(
                        text = "Viagens",
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFFF61221)
                    )
                }
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    Image(
                        painterResource(R.drawable.chat),
                        contentDescription = "Chat",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(40.dp)
                            .padding(start = 0.dp)
                    )
                    Text(
                        text = "Chat",
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFFF61221)
                    )
                }
                Column (
                    horizontalAlignment = Alignment.CenterHorizontally,
                ){
                    Image(
                        painterResource(R.drawable.perfil),
                        contentDescription = "Perfil",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(42.dp)
                            .padding(start = 0.dp)
                    )
                    Text(
                        text = "Perfil",
                        fontWeight = FontWeight.SemiBold,
                        color = Color(0xFFF61221)
                    )
                }
            }
        }
    }
}

@Preview
@Composable
fun PreviewContatos() {
    Contatos(controleDeNavegacao = NavHostController(LocalContext.current))
}