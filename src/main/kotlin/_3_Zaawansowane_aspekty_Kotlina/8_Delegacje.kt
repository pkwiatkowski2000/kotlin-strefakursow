package _3_Zaawansowane_aspekty_Kotlina

interface Base{
    fun print()
}

class BaseImpl(private val x: Int): Base{
    override fun print() {
        print(x)
    }

}

class BaseImpl2(b: Base): Base by b

fun main() {

    val baseImpl = BaseImpl(10)
    val baseImpl2 = BaseImpl2(baseImpl)
    baseImpl2.print()

    // Lazy pozwala odwlec moment obliczenia wartości do pierwszego pojawienia się zmiennej


    val x by lazy {
        10
    }

    println(x)

}