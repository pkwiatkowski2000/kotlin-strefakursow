package _2_Programowanie_obiektowe_w_Kotlinie

fun main(args: Array<String>) {

    // Domyślnie nie dziedziczymy, ale jak napisze się open class to można dziedziczyć
// Możemy dziedziczyć tylko po jednej klasie
    open class Animal(open var weight: Int) {

        var legs = 4
        var isHaveTail = false

        open fun eat() {
            println("Mniam")
        }

    }

    class Dog(weight: Int) : Animal(weight) {
        override var weight: Int = 10
        override fun eat() {
            super.eat()
            println("Wszystko zjedzone")
        }

        fun hauHau() {
            super.legs
            eat()
        }
    }

//*class Cat() : Animal() {

    var weight: Int = 2
//*

    val dog = Dog(10)
    dog.eat()

}