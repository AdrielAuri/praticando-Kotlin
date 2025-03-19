//9- Peça ao usuário um número e imprima a tabuada desse número (de 1 a 10).

fun main() {

    println("Informe um número inteiro")
    val no1 = readLine()?. toIntOrNull()?: 0

    println("A tabuada do $no1 é:\n")

    for (i in 1 .. 10){
        println("$no1 x $i = ${no1 * i}")
    }

}