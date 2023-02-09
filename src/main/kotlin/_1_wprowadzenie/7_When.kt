package _1_wprowadzenie

fun main(args: Array<String>) {

    var liczba = 152
    when (liczba){
        153 -> {println("Jest równa 153")}
        is Int -> {println("Zmienna jest intem")}
        in 100..200 -> {println(" Mieści się w zakresie 100 do 200")}
        else -> {}
    }
    // Zawsze wykonywany jest 1 warunek, gdy jest prawdziwy

    val zmienna = when(liczba){
        153 -> 100
        else -> "Paweł"
    }

    when(zmienna){
        is Int -> {}
        is String -> {}
    }
}