package _2_Programowanie_obiektowe_w_Kotlinie

//POJO - Plane Old Java Objects - nie mają specjalnych zachowań - "Kontenery na dane"

class Client(val name: String, val surname: String)
data class ClientData(val name: String, val surname: String, var id: Int = 1) {

}

fun main(args: Array<String>) {

    val client = Client( "John", "Smith")
    val clientData = ClientData("John", "Smith", 1)

    val clientData1 = ClientData( "John", "Smith", 1)

    println(client.toString())
    println(clientData.toString())

    if(clientData.equals(clientData1)){
        println("Takie same")
    }




}