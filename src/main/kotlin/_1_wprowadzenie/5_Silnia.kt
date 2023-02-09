package _1_wprowadzenie

fun main(args: Array<String>) {

    // Silnia - n! - 1*2*3*...*n
    print("Podaj liczbe nieujemną: ")

    // Int i Int?
    // String i String?

    /*var nieNulowe: Int = null? Jeżeli daję znak zapytania na końcu to mówię - "to może być null"*/

    //!! -> NA STO PROCENT TO NIE JEST NULL
    //? -> TO MOŻE BYĆ NULL

    val input = readLine()!!.toInt()

    // Silnia dla 0 oraz 1 zwraca wynik 1

    if(input == 0 || input == 1) println("Wynik to: 1")
    else{
        var silnia = 1
        // 1*2*3*4
        for (i in 2.. input){
            silnia*= i
        }
        println("Wynik to: $silnia")
    }
}