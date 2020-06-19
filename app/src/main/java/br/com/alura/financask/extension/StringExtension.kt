package br.com.alura.financask.extension

import java.text.SimpleDateFormat
import java.util.*

fun String.limitaEmAte(caracteres: Int) : String{
    if (this.length > caracteres) {
        val primeiroCaractere = 0
        return "${this.substring(primeiroCaractere, caracteres)}..."
    }

    return this
}

fun String.converteParaCalentdar () : Calendar {
    val formatoBrasileiro = SimpleDateFormat("dd/MM/yyy")
    val dataConvertida: Date = formatoBrasileiro.parse(this)
    val data = Calendar.getInstance()
    data.time = dataConvertida

    return data
}