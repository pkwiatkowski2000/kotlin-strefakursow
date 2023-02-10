package _1_wprowadzenie

fun main(args: Array<String>) {
    //BINARNY - DWÓJKOWY
    val x = 2 // 0010 -> 0*2^3 + 0*2^2 + 1*2^1 + 0*2^0
    val y = 5 // 0101 -> 0*2^3 + 1*2^2 + 0*2^1 + 1*2^0

    //0010 o 1 miejsce w lewo -> 0100
    //0010 o 1 miejsce  prawo -> 0001

   /* val wynik = x shr 1
    println(wynik)*/

    val wynik = x shr  1
    println(wynik)

    //DZIESIĘTNY ZAPIS
    val z = 15 //11 -> 1*10^1 + 5*10^0
}