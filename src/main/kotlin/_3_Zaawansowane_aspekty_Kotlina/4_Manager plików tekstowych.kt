package _2_programowanie_obiektowe

/*
import Models.ApiResponse
import com.google.gson.Gson
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse
import java.time.Duration

interface WebConnectorInterface {
    fun makeRequest(): String
}

class WebConnector(private val url: String) : WebConnectorInterface {

    private val httpClient = HttpClient.newBuilder()
        .connectTimeout(Duration.ofMinutes(1))
        .build()

    private val httpRequest = HttpRequest.newBuilder()
        .uri(URI.create(url))
        .build()

    override fun makeRequest(): String {
        val httpResponse = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString())
        return httpResponse.body()
    }

}

class NetworkParser{

    private val gson = Gson()

    fun getApiResponse(json: String): ApiResponse {
        return gson.fromJson(json, ApiResponse::class.java)
    }
}

fun main() {
    val wc = WebConnector("https://rickandmortyapi.com/api/character")
    val parser = NetworkParser()
    val apiResponse = parser.getApiResponse(wc.makeRequest())

    print("Co chcesz wylistowac: ")
    when(readLine()!!.toString().lowercase().trim()){
        "name" -> {
            for (result in apiResponse.results){
                println(result.name)
            }
        }
        "name&created" -> {
            for (result in apiResponse.results){
                println("${result.name}::${result.created}")
            }
        }
    }
}*/
