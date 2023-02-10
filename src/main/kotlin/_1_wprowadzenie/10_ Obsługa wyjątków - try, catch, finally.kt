package _1_wprowadzenie

fun main (args: Array<String>) {

    val tablica = arrayOf(1)

    try {
        val input = readLine()!!.toInt()
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("Próbujesz dostać się do indexu, który nie istnieje")
    } catch (exc: NumberFormatException) {
        println("Próbujesz zamienić na liczbę niepoprawny ciąg znaków")
    } finally {
        println("Wykonaj się bezwzględnie")
    }
}