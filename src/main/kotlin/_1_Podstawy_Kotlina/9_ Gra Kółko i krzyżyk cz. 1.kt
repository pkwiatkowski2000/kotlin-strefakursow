package _1_Podstawy_Kotlina

import kotlin.random.Random

fun main(args: Array<String>) {

    val board = Array(9){ 0 }
    var champion: String? = null

    while (true){
        drawBoard(board)
        getUserMove(board)

        champion = getWinner(board)
        if(champion != null){
            println(champion)
            println("-----------")
            drawBoard(board)
            break
        }

        if(isGameEnd(board)){
            println("Remis")
            break
        }

        getComputerMove(board)

        champion = getWinner(board)
        if(champion != null){
            println(champion)
            println("-----------")
            drawBoard(board)
            break
        }

    }

    /*
    Player -> 1
    Computer -> -1
    Puste -> 0
     */

    //1. Wypisz plansze - CHECKED
    //2. Pobierz pole od uzytkownika - CHECKED
    //3. Pobierz pole od komputera - CHECKED
    //4. Sprawdz wygrana

    /*
     1 1 1
     1 1
     1   1

     */

}

fun getWinner(board: Array<Int>): String? {
    if(checkRows(board) == 3) return "Wygral gracz"
    if(checkRows(board) == -3) return "Wygral komputer"

    if(checkColumns(board) == 3) return "Wygral gracz"
    if(checkColumns(board) == -3) return "Wygral komputer"

    if(checkDiagonal(board) == 3) return "Wygral gracz"
    if(checkDiagonal(board) == -3) return "Wygral komputer"

    return null

}

fun isGameEnd(board: Array<Int>): Boolean {
    for (i in board){
        if(i == 0) return false
    }
    return true

}

fun checkDiagonal(board: Array<Int>): Int? {
    val diagonal1 = board[0]+board[4]+board[8]
    val diagonal2= board[6]+board[4]+board[2]

    if(diagonal1 == 3 || diagonal1  == -3) return diagonal1
    if(diagonal2 == 3 || diagonal2 == -3) return diagonal2

    return null
}


fun checkColumns(board: Array<Int>): Int? {
    for (i in 0..2){
        val sum = board[0+i] + board[3+i] + board[6+i]
        if(sum == 3 || sum == -3) return sum
    }
    return null
}

fun checkRows(board: Array<Int>): Int? {
    /*
     0 1 2
     3 4 5
     6 7 8
     */

    var sum = 0
    for (i in 0..8){
        if(i !=0 && i%3==0) sum = 0
        sum += board[i]
        if(sum == 3 || sum == -3) return sum
    }

    return null
}

fun getComputerMove(board: Array<Int>) {

    while (true){
        val computerMove = Random.nextInt(0,9)
        if(board[computerMove] != 0){
            continue
        }
        board[computerMove] = -1
        break
    }
}

fun getUserMove(board: Array<Int>) {

    while (true){
        print("Podaj numer pola (0-8): ")
        val userMove = readLine()!!.toInt()

        if(userMove !in 0..8){
            println("Nie ma takiego pola!")
            continue
        }

        if(board[userMove] != 0){
            println("Pole jest zajete!")
            continue
        }

        board[userMove] = 1
        break
    }
}

fun drawBoard(board: Array<Int>) {
    /*
     0 0 0
     0 0 0  <---> 0 0 0 0 0 0 0 0 0
     0 0 0
     */
    for (i in 0..8){
        if (i != 0 && i%3==0) println()
        print("${board[i]}|")
    }
    println()

}
