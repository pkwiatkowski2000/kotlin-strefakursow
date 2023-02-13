package _2_Programowanie_obiektowe_w_Kotlinie


// Interface'y nie przechowują stanu


    interface Animal {
        var weight: Int

        fun eat(): Boolean
        fun drink(): Boolean

        fun jump(){
            println("Hop")
        }

    }

interface Pet{

    var owner: String
}

    class Dog : Animal, Pet {
        override var weight: Int = 10

        override fun jump() {
            super.jump()
            println("Hop Hop")
        }
        override fun eat(): Boolean {
            println("Mniam")
            return true
        }

        override fun drink(): Boolean {
            println("Gul gul")
            return true
        }

        override var owner: String = "Krystian"

    }

fun main(args: Array<String>) {

    val dog = Dog()
    dog.jump()

}