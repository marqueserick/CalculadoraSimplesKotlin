package menu

import continuar
import operacoes.*

class Menu(continuar: Boolean, opcao:Int,n1:Float,n2:Float) {
    constructor(): this(true,1,0f,0f)

    fun confirmarOperacao(opcao: Int):String{
        val n=0f
        var confirmacao = ""
        when(opcao){
            1 -> confirmacao = "Você selecionou adição\n"
            2 -> confirmacao = "Você selecionou subtração\n"
            3 -> confirmacao = "Você selecionou multiplicação\n"
            4 -> confirmacao = "Você selecionou divisão\n"
            else -> selecionarOperacao(opcao,n,n)
        }
        if(continuar){
            return confirmacao + "Digite dois números para realizar operação\n"
        }else{
            return ""
        }

    }

    fun selecionarOperacao(opcao: Int, n1: Float, n2: Float){
        when(opcao){
            1 -> {
                val operacao = Adicao()
                println(operacao.operacao(n1,n2))

            }
            2 -> {
                val operacao = Subtracao()
                println(operacao.operacao(n1,n2))
            }
            3 -> {
                val operacao = Multplicacao()
                println(operacao.operacao(n1,n2))
            }
            4 -> {
                val operacao = Divisao()
                println(operacao.operacao(n1,n2))
            }
            else -> {
                continuar = pararCalculadora()
                println("Parar calculadora")
            }
        }
    }

    fun pararCalculadora(): Boolean{
        return false
    }

}