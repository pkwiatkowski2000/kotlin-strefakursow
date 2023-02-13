package _2_Programowanie_obiektowe_w_Kotlinie

/*abstract class Animal{

    val weight = 10


    class Dog: Animal(){


    }


}
fun main (args: Array<String>) {

    val dog = Dog()*/

abstract class BaseView(){

    var witdh = 300
    var height = 300
    var color = "BLACK"

    abstract fun draw()

}
class TextView(): BaseView() {
    override fun draw() {
        // Logika rysowania
    }
}

class EditText(): BaseView(){
    override fun draw() {
        // Logika rysowania
    }
}

fun main (args: Array<String>) {

}
