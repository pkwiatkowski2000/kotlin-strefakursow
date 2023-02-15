package _3_Zaawansowane_aspekty_Kotlina

infix fun String.concate(element: String) = this+element

fun main() {

    val result1 = "Hej".concate("Wojtek")
    val result2 = "Hej" concate "Wojtek"

    println(result1)
    println(result2)
}