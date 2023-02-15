package _3_Zaawansowane_aspekty_Kotlina

fun <T,V>pairOrNull(a: T, b: V): Pair<T, V>? {
    return if(a == null || b == null) null
    else a to b

}

interface  MyInterface< in T, out V> {
    fun doSomething(element: T): V


}

class MyClass<in T, out V>{
    fun makeNoise(t: T){}
}

fun main() {

    val pair = pairOrNull(2f, null)
    val classGeneric = MyClass<Int, Float>()
    println(pair)

}