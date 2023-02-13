package _2_Programowanie_obiektowe_w_Kotlinie

//POJO - Plane Old Java Objects - nie mają specjalnych zachowań - "Kontenery na dane"

class Client(val name: String, val surname: String)
data class ClientData(val name: String, val surname: String)

fun main(args: Array<String>) {

    val client = Client( "John", "Smith")
    val clientData = ClientData("John", "Smith")

    println(client.toString())
    println(clientData.toString())




}