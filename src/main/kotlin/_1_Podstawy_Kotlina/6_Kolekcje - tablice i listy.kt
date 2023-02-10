package _1_Podstawy_Kotlina

fun main(args: Array<String>) {

    /*var day1 = 12
    var day2 = 12
    var day3 = -12
    day1 + day2 + day3 ... itd.*    // Gdyby nie było tablic to tak by trzeba było liczyć
     */

    // val tablica = arrayOf (12f,12.2,124,156,178,1)

    // Numerujemy od 0, w większości języków programowania tak jest

    // println(tablica[0]) W nawiasach kwadratowych wpisujemy numer

    // for(i in 0.. 2 ){

   /* tablica[0] = 5f
    tablica[0]
    println(tablica[0])*/

   /* val list = listOf (12f,12.2,124,156,178,1)
    list[0] = 5f*/

    // Listy różnią się od tablic, że możemy odnosić się do wartości, ale nie możemy ich podmieniać

  /*  val mutableList = mutableListOf(12f,12.2,124,156,178,1)
    mutableList[0] = 5f

    // Przez mutableList możemy podmienić wartość

    val arrayList = ArrayList<Float>()
    arrayList.add(1f)
    arrayList.add(2f)*/

    // Tak robimy, gdy chcemy dodać elementy

    val testowaTablica = arrayOf("String", "Coś", "xdxd")


    for (element in testowaTablica){
        println(element)
    }

    for(i in 0..testowaTablica.size-1){
        println(testowaTablica[i])
    }

   // Element to zmienna, która w każdym przejściu będzie przyjmować kolejny element naszej kolekcji
    }