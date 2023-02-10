package _2_Programowanie_obiektowe_w_Kotlinie

import kotlin.random.Random
import com.sun.java.swing.SwingUtilities3

//Nazwy klas zaczynamy z dużej litery

/*class Auto(){
    val silnik
    val kierownica
    val siedzenia
    val koła
}*/

    val tablica = Array<Int>(5) { 0 }
    val liczba = Int

    class Pracownik(val imie: String,
                    val nazwisko: String,
                    var wiek: Int,
                    val pesel: String) {

        init {
            println("Imie: $imie, nazwisko: $nazwisko")

        }

        fun aktualizujWiek(wiek: Int){
            this.wiek = wiek
        }

    }

        // Klasa jest przepisem jak stworzyć obiekt
        // A obiekt jest konkretną reprezentacją klasy

fun main(args: Array<String>) {

    val liczba = Random.nextInt()
    val x = java.util.Random()

    val pracownik = Pracownik("Wojtek", "Kowalski", 32, "123456789" )
    val pracownik2 = Pracownik("Andrzej", "Nowak", 56, "999888777" )

    println("Pracownik 1: ${pracownik.imie}")
    println("Pracownik 2: ${pracownik2.imie}")

}


