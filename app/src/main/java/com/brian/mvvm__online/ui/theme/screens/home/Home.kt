package com.brian.mvvm__online.ui.theme.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.brian.mvvm__online.R
import com.brian.mvvm__online.navigation.ROUTE_ABOUT

@Composable
fun HomeScreen(navController: NavHostController) {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Gray)
    )
    {
        Text(
            text = "This is Home Screen",
            color = Color.Green,
            fontSize = 30.sp,
            fontFamily = FontFamily.SansSerif
        )

    Spacer(modifier = Modifier.height(25.dp))
    Button(
        onClick = {
                  navController.navigate(ROUTE_ABOUT)

        },
        modifier = Modifier.width(300.dp)
    ) {
        Text(text = "About",
             fontSize = 28.sp)
    }
    Image(painterResource(id = R.drawable.person), contentDescription ="Person")
  }
}

@Preview
@Composable
private fun Homepre(){
    HomeScreen(navController = rememberNavController())
}