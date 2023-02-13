package _2_Programowanie_obiektowe_w_Kotliniehow to disable changes intellij idea

import org.apache.commons.csv.CSVRecord

class Client(val name: String,
             val surname: String,
             val pesel: String)

interface CsvManagerInterface{
    fun readCsv(): List<CSVRecord>
    fun writeCsv(clients: List<Client>)
    fun
}

fun main(args: Array<String>) {

    /*
    John,Smith, 13,1,1,1
    Kate,Barry,1,1,1,1


     */
}