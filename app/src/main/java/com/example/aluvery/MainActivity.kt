package com.example.aluvery

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.aluvery.ui.theme.AluveryTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent{
            MyfristComposalbe()
        }
    }
}

@Composable
fun MyfristComposalbe()
{
    Text(text = "Teste teste")

}
@Preview
@Composable
fun MyfristComposalbePreview()
{
    Text(text = "teste teste")
}

@Preview
@Composable
fun MySecondtComposalbePreview()
{
    Text(text = "Novo App")
}


