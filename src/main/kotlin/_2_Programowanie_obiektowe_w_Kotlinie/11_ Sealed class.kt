package _2_Programowanie_obiektowe_w_Kotlinie

sealed class Response{
    class Success(val data: String): Response()
    class Failure(val errorCode: Int): Response()
    class Loading (val isLoading: Boolean): Response()
}
fun getResponse(response: Response){
    when(response){
        is Response.Success -> { response.data }
        is Response.Failure -> { response.errorCode }
        is Response.Loading -> { response.isLoading }
    }
}

/*enum class Response{
    SUCCESS, FAILURE, LOADING
}

class Data(){}

fun getResponse(response: Response){
    when(response){
        Response.SUCCESS -> Data()
        Response.FAILURE ->
    }
}*/

fun main(args: Array<String>) {

}