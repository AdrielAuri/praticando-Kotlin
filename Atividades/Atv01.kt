/*1 - Faça um algoritmo que leia os valores de A, B, C e em seguida imprima na tela a soma entre A e B e mostre
 se a soma é menor que C */

fun main() {

    println("Informe o primeiro número inteiro: ")
    val a = readLine()?. toIntOrNull() ?: 0 //Leitura e conversão da variável 'a'

    println("Informe o segundo número inteiro: ")
    val b = readLine()?. toIntOrNull() ?: 0

    println("Informe o terceiro número inteiro: ")
    val c = readLine()?. toIntOrNull() ?: 0

    val soma = a + b
    println("A soma entre a e b é = $soma")

    if (soma > c) {
        println("A soma entre $a e $b é maior que $c.")
    }
    else{
        println("A soma entre $a e $b é menor que $c.")
    }
}