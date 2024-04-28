package com.brian.mvvm__online.ui.theme.screens.registration

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.brian.mvvm__online.R

@Composable
fun RegisterScreen(navController: NavHostController) {
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var confirmpassword by remember { mutableStateOf("") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
            .padding(vertical = 15.dp)

    ) {
        Image(painterResource(id = R.drawable.reg), contentDescription ="Icon")
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Create An Account",
            color = Color.Green,
            fontSize = 20.sp


        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = name,
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Person,
                    contentDescription = "person"
                )
            },
            onValueChange = { name = it },
            label = {
                Text(
                    text = "Enter Name",
                    color = Color.Green,
                    fontSize = 20.sp


                )
            },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = email,
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "email") },
            onValueChange = { email = it },
            label = {
                Text(
                    text = "Enter Email",
                    color = Color.Green,
                    fontSize = 20.sp


                )


            },

            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(15.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "pass") },
            label = {
                Text(
                    text = "Enter Pass",
                    color = Color.Green,
                    fontSize = 20.sp

                )
            },
            modifier = Modifier.fillMaxWidth()


        )
        Spacer(modifier = Modifier.height(15.dp))
        OutlinedTextField(
            value = confirmpassword,
            onValueChange = { confirmpassword = it },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.ThumbUp,
                    contentDescription = "lock"
                )
            },
            label = {
                Text(
                    text = "Confirm Pass",
                    color = Color.Green,
                    fontSize = 20.sp


                )
            },
            modifier = Modifier.fillMaxWidth()


        )
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(Color.Gray)


        ) {
            Text(
                text = "Register",
                fontSize = 20.sp,
            )
        }

    }
}
@Preview
@Composable
private fun Registerpre(){
    RegisterScreen(navController = rememberNavController())
}