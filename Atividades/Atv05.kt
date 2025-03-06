/*5- Faça um for de 1000 números, onde a pessoa vai digitar um novo valor, e mostre todos valores menor
do que a pessoa digitou.  (Fazer FOR)*/

fun main(){

    println("Informe um número inteiro: ")
    var no1 = readLine()?. toIntOrNull() ?: 0

    if(no1 < 1000) {
        for (i in no1 downTo 0) { //i recebe a variável no1 e vai reduz até 0
            println("$i")
        }
    }
    else{
        println("Informe um número menor que 1000")
    }
}