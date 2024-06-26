import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.parcial1.ui.theme.Parcial1Theme

@Composable
fun MainPage(modifier: Modifier = Modifier) {
    var email by remember {
        mutableStateOf("")
    }
    var contraseña by remember {
        mutableStateOf("")
    }
    val navController = rememberNavController()

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Iniciar sesión", style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = "", // email
            onValueChange = {
                email = it
            }, // Ver que hace esta linea
            label = { Text("Correo electrónico") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = "", // contraseña
            onValueChange = {
                contraseña = it
            },
            label = { Text("Contraseña") },
            modifier = Modifier.fillMaxWidth(),
            visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {
                if (email == "pedro@pe.com.ar" && contraseña == "abc123") {
                    navController.navigate("Bienvenida/$email")
                } else {
                    //Mostrar mensaje de error
                }

            },
            modifier = Modifier.fillMaxWidth(0.5f)
        ) {
            Text("Iniciar sesión")
        }
    }



}

@Preview(showBackground = true)
@Composable
fun MainPagePreview() {
    Parcial1Theme {
        MainPage()
    }
}