import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.parcial1.ui.theme.Parcial1Theme

@Composable
fun Bienvenida( modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
    Text(text = "Hola")
    }
}
@Preview(showBackground = true)
@Composable
fun BienvenidaPreview() {
    Parcial1Theme {
        Bienvenida()
    }
}