package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.Cartao
import com.example.santanderdevweek.data.Cliente
import com.example.santanderdevweek.data.Conta

class FakeData {
    fun getLocalData() : Conta {
        val cliente = Cliente("Hugo")
        val cartao = Cartao("888888888")
        return Conta(
            "445666-7",
            "8756-8",
            "R$ 1.014,37",
            "R$ 2.014,37",
            cliente,
            cartao
        )
    }
}