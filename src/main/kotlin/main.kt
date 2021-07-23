import operacoes.*
import menu.Menu

var continuar = true

fun main(args: Array<String>) {

    var opcao = 0
    var n1 = 0f
    var n2 = 0f
    val menu = Menu()

    do{
        println("Escolha uma opção\n1-Adição\n2-Subtração\n3-Multiplicação\n4-Divisão")
        opcao = readLine()!!.toInt()
        println(menu.confirmarOperacao(opcao))
        if(continuar) {
            n1 = readLine()!!.toFloatOrNull()!!
            n2 = readLine()!!.toFloatOrNull()!!
            if(n1 != null && n2!=null){
                menu.selecionarOperacao(opcao, n1, n2)
            }else{
                println("Números digitados são inválidos")
            }
        }else{
            continue
        }
    }while(continuar)
}


