package br.com.maschdy.studyCaseWithelabel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import br.com.maschdy.studyCaseWithelabel.ui.theme.Primary
import br.com.maschdy.studyCaseWithelabel.ui.theme.StudyCaseWithelabelTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val appName = getString(R.string.app_name)
        setContent {
            StudyCaseWithelabelTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Primary
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Image(
                            modifier = Modifier
                                .size(300.dp),
                            painter = painterResource(id = R.drawable.app_logo),
                            contentDescription = "Logo"
                        )
                        AppName(appName)
                    }
                }
            }
        }
    }
}

@Composable
fun AppName(name: String, modifier: Modifier = Modifier) {
    Text(
        text = name,
        color = Color.White,
        modifier = modifier
    )
}
