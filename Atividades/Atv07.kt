//7- Solicite ao usuário um número inteiro e imprima todos os números de 1 ate N. Dica: Use um loop for.

fun main() {

    println("Informe um número inteiro")
    val no1 = readLine()?. toIntOrNull()?: 0

    println("A tabuada do $no1 é:\n")

    for (i in 1 .. 10){
        println("$no1 x $i = ${no1 * i}")
    }

}