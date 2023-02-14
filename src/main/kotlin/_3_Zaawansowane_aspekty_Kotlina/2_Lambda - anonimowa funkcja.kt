package _3_Zaawansowane_aspekty_Kotlina

// Jeżeli coś nie ma nazwy, to nazywa się to "anonimowe"

// Jeżeli Lambda coś zwraca, to ostatnia operacja jest zwracana

fun doOperation(a: Int,
                b: Int,
                operationFirst: (Int, Int) -> Int,
                operationSecond: (Int, Int) -> Int): Int {

    return operationSecond(a,b)
}

fun main() {


    val lambda = {a: Int, b: Int ->
        a+b
        a*b
        a/b
        a+2
    }

    val wynik = doOperation(
        a = 2,
        b = 5,
        operationFirst = {a,b -> a*b},
        operationSecond = {a,b -> a+b})

    println(wynik)

    val wynik2 = lambda.invoke(5,5)
    println(wynik2)


}