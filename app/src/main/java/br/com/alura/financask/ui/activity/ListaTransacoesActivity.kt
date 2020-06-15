package br.com.alura.financask.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import br.com.alura.financask.R
import br.com.alura.financask.model.Tipo
import br.com.alura.financask.model.Transacao
import br.com.alura.financask.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal
import java.util.*

class ListaTransacoesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) : Unit {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transacoes = listOf(Transacao(
            valor = BigDecimal(20.5),
            tipo = Tipo.DESPESA,
            categoria = "almoço de fim de semana"),
            Transacao(
            tipo = Tipo.DESPESA,
            data = Calendar.getInstance(),
            valor = BigDecimal(20.50)),
            Transacao(
                valor = BigDecimal(100.0),
                tipo = Tipo.RECEITA,
                categoria = "Economia"),
            Transacao(
                valor = BigDecimal(120.0),
                tipo = Tipo.DESPESA),
            Transacao(
                valor = BigDecimal(500.0),
                categoria = "Prêmio",
                tipo = Tipo.RECEITA))

        lista_transacoes_listview.adapter = ListaTransacoesAdapter(transacoes, this)
    }
}