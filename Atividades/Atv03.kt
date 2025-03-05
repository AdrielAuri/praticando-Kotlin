/*3 - Faça um algoritmo que leia dois valores inteiros A e B, se os valores de A e B forem iguais,
deverá somar os dois valores*/

fun main(){

    println("Informe o primeiro número inteiro: ")
    val no1 = readLine()?. toIntOrNull() ?: 0

    println("Informe o segundo número inteiro: ")
    val no2 = readLine()?. toIntOrNull() ?: 0

    val soma = no1 + no2
    if(no1 == no2){
        println("Os números $no1 e $no2 são iguais, por tanto soma é = $soma")
    }
    else{
        println("Os números $no1 e $no2 não são iguais.")
    }
}