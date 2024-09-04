package cl.bootcamp.mostrarimagen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun MainScreen() {
    var isImageVisible by remember { mutableStateOf(false) }
    var buttonText by remember { mutableStateOf("Mostrar Imagen") }

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Text(
            text = "¡Bienvenidos!",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "- Nathaly Vargas -",
            fontSize = 20.sp,
            modifier = Modifier.padding(top = 16.dp, bottom = 16.dp)
        )
        Button(
            onClick = {
                isImageVisible = !isImageVisible
                buttonText = if (isImageVisible) "Ocultar Imagen" else "Mostrar Imagen"
            },
            colors = ButtonDefaults.buttonColors(
                containerColor = androidx.compose.ui.graphics.Color(0xFF6007C5)
            ),
            modifier = Modifier.padding(16.dp)
        ) {
            Text(buttonText, color = androidx.compose.ui.graphics.Color.White)
        }
        if (isImageVisible) {
            Image(
                painter = painterResource(id = R.drawable.saludo),
                contentDescription = null,
                modifier = Modifier.fillMaxWidth().height(200.dp)
            )
        }
    }
}