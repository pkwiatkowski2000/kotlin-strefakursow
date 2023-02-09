package _1_wprowadzenie

import kotlin.random.Random

fun main(args: Array<String>) {

    /* Player -> 1
    Computer -> -1
    Puste -> 0

     */

    //1. Wypisz plansze CHECKED
    //2. Pobierz pole od użytkownika CHECKED
    //3. Pobierz pole od komputera CHECKED
    //4. Sprawdź wygraną


    val board = Array(9){ 0 }
    drawBoard(board)
    getUserMove(board)
    getComputerMove(board)
    drawBoard(board)
    checkRows()
}

fun checkRows() {

}

fun getComputerMove(board: Array<Int>) {

    while (true){
        val computerMove = Random.nextInt(0, 9)
        if (board[computerMove] != 0){
            continue
        }
        board[computerMove] = -1
        break
    }

}

fun getUserMove(board: Array<Int>) {

    while (true){
        print ("Podaj numer pola (0-8):  ")
        val userMove = readLine()!!.toInt()

        if(userMove !in 0..8) {
            println("Nie ma takiego pola")
            continue
        }

        if(board[userMove] != 0) {
            println("Pole jest zajęte!")
            continue
        }

        board [userMove] = 1
        break
    }
}

fun drawBoard(board: Array<Int>) {
    for (i in 0..8){
        if (i != 0 && i%3==0) println()
        print ("${board[i]}|")
    }
    println()
}
