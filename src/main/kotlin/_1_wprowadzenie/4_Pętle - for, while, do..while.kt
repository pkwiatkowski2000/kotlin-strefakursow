package _1_wprowadzenie

import kotlin.random.Random

fun main(args: Array<String>) {

    /*for(i in 0..10){
        println(i)
    }

    for(i in 0..10 step 2) println(i)*/   /*Nie trzeba pisać klamry, jeżeli jest tylko jedna instrukcja.
                                            Jeżeli nie ma klamry to pierwsza instrukcja, która jest pod forem będzie brana do środka fora.*/
    /*

    for (i in 10 downTo 0) println(i)

    for (i in 0 until 10 ) println(i)  // Do przedziału nie wchodzi 10

    //----------Pętla WHILE---------- Blok instrukcji jest wykonywany tak długo jak warunek jest prawdziwy
*/

    /* var licznik = 0

    while (licznik < 10){
        println(licznik)
        licznik++ // Będzie dodawać tak długo dopóki warunek będzie prawdziwy
    }*/

    //----------Pętla do..while---------- Pętla wykona się zawsze przynajmniej 1 raz

    /*do {
        println("Coś wypisane mimo, że false!")

    }while (false)*/

    /* var counter = 0
    while (true){
        counter++
        val rand = Random.nextInt()
        if(rand%2==0) break
    }
    println(counter)*/

    for (i in 0..10) {
        if (i % 2 == 0) continue // Continue przerywa aktualne przejście pętli, ale nie kończy tej pętli
        println(i)
    }

}