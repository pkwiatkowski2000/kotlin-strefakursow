package _2_Programowanie_obiektowe_w_Kotlinie

enum class Orientation{
    PORTRAIT, LANDSCAPE, REVERSED_PORTRAIT, REVERSED_LANDSCAPE
}

fun setOrientation(orientation: Orientation) {
    when(orientation){
        Orientation.PORTRAIT -> {
        }
        Orientation.LANDSCAPE -> {
        }
        Orientation.REVERSED_PORTRAIT -> {
        }
        Orientation.REVERSED_LANDSCAPE -> {
        }
        else -> {}
    }

}

fun main(args: Array<String>) {


}