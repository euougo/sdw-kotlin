package com.example.santanderdevweek

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Declaração de variáveis
        // val - valor que não muda - imutável
        // var - valor variável - mutável
        var contador : Int = 10
        contador = 11

        val contador2 : Int = 20
        // contador2 = 21 // não é mutável

        // Segurança Nula
        val languageName: String? = null
        // Safe args - ? = uma variável pode ser nula

        // Condicionais
        // if else
        var idade = 20

        if (idade > 18) {
            println("Você é maior de idade")
        } else {
            println("Você é menor de idade")
        }

        var minhaIdade : String = if (idade > 18) {
            "Você é maior de idade"
        } else {
            "Você é menor de idade"
        }

        // when
        var minhaIdade2 = when {
            idade > 18 -> "Você é maior de idade"
            else -> "Você é menor de idade"
        }

        // Funções
        fun minhaIdade3() : String {
            return "Minha idade é 18"
        }
        minhaIdade3()

        fun minhaIdade4() : String =
            "Minha idade é 18"

        // Classes
        // add class Medicamento
        val medicamento = Medicamento("Teste 1", "2x ao dia")
        // getters e setters são declarados de forma implícita
        medicamento.formula


    }
}
















