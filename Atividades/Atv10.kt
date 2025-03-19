/*10- Peça ao usuário um número  e, em seguida, conte e imprima quantos números pares e ímpares existem de 1 
até o numero que o usuário digitou. */

fun main() {

    println("Informe um número inteiro: ")
    val no1 = readLine()?. toIntOrNull()?: 0
    var contPar = 0
    var contImpar = 0

    for (i in 1 .. no1){
        if(i % 2 == 0){
            contPar += 1
            println("$i é um número par ")
        } else{
            contImpar += 1
            println("$i é um número ímpar")
        }
    }
    println("\nO número $no1 tem $contPar números pares e $contImpar números ímpares ")
}