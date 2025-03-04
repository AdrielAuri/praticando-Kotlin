/*2 - Faça um algoritmo para receber um número qualquer e imprimir na tela se o número é par ou ímpar,
positivo ou negativo.*/

fun main() {
    println("Digite um número: ")
    val no1 = readLine()?.toIntOrNull() ?: 0

    if (no1 % 2 == 0) {
        if (no1 < 0) {
            println("O número $no1 é par e negativo")
        } else {
            println("O número $no1 é par e positivo")
        }
    } else {
        if (no1 < 0) {
            println("O número $no1 é ímpar e negativo")
        } else {
            println("O número $no1 é ímpar e positivo")
        }
    }
}
