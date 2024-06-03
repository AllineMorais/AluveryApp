package com.example.aluvery.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class ComponentsTest {

    @Preview(showBackground = true)
    @Composable
    fun MyPrimaryRowPreview() {
        Row(
            modifier = Modifier
                .padding(10.dp)
                .height(40.dp)
                .background(color = Color.Red)

        ) {
            Column(
                modifier = Modifier
                    .padding(10.dp)
                    .background(color = Color.Cyan)
                    .fillMaxSize()


            ) {
                Text(text = "Primeira Coluna")
            }
            Column(
                modifier = Modifier.padding(10.dp)
                    .background(color = Color.Magenta)
            ) {
                Text(text = "Segunda Coluna")
            }
            Column(modifier = Modifier.padding(10.dp)) {
                Text(text = "terceira Coluna")
            }
        }
    }
}