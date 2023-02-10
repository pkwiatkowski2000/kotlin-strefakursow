package _1_Podstawy_Kotlina

fun dodaj(a: Int, b: Int): Int{
    //Wykonujemy logikę

    return a+b //10+20 = 30
}

/*fun main(args: Array<String>) {

    val wynik = dodaj(10, 20) //30
    println(wynik)*/

fun czyParzysta (liczba: Int): Boolean {
    if (liczba % 2 == 0) return true
    else return false
}

fun silnia (input: Int): Int {
    return if (input == 0 || input == 1) 1
    else {
        var silnia = 1
        // 1*2*3*4
        for (i in 2..input) {
            silnia *= i
        }
        silnia
    }
}

fun main(args: Array<String>) {

    val x = dodaj(11, 20) // 10+20
    println(czyParzysta(x))
    czyParzysta(4324324)
    println(silnia(8))
    opcjonalneParametry(10, 36)


}

fun opcjonalneParametry(liczba: Int, mnożnik: Int = 10){

}

