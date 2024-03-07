package com.example.constraintlayout

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.constraintlayout.ui.theme.ConstraintLayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnCalcular = findViewById<Button>(R.id.btnCalcular)
        btnCalcular.setOnClickLisntenner { view: View? ->
            var txtAlcool = findViewById<EditText>(R.id.txtPrecoAlcool)
            var precoAlcool = txtAlcool.text.toString().toDouble()
            var txtGasolina = findViewById<EditText>(R.id.txtPrecoGasolina)
            var precoGasolina = txtGasolina.text.toString().toDouble()
            var resultado: Doube = precoAlcool / precoGasolina
            var mensagem = ""
            if (resultado > 0.7) {
                mensagem = "Gasolina"
            } else if (resultado < 0.7) {
                mensagem = "Alcool"
            } else {
                mensagem = "Tanto faz"
            }
            Toast.makeText(this, mensagem, Toast.LENGTH_LONG).show()
        }

    }
}