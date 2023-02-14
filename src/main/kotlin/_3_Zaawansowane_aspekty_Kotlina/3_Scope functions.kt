package _3_Zaawansowane_aspekty_Kotlina

class Person {
    var name = ""
    var surname = ""
    var age = 0

    fun incAge() {
        age++
    }

    fun addConstToSurname() {
        surname += "son"
    }

}

fun main() {
    val person = Person()
    person.age = 10
    person.name = "Wojtek"
    person.surname = "Kowalski"

    person.apply {
        age = 10
        name = "Wojtek"
        surname = "Kowalski"
    }

    val nameSize = person.name
        .let {it.length }
        .let {it*it }

    var cośCoMożeByćNullem: Int? = null

    cośCoMożeByćNullem?.let  {nieNull ->
        println("Wartość równa się: $nieNull")
    }

    println(nameSize)

    val newPerson = Person()
        .apply {
            age = 10
            name = "Wojtek"
            surname = "Kowalski"
        }.also {
            it.incAge()
            it.addConstToSurname()
        }

    println(newPerson.age)
    println(newPerson.surname)

    val startEngine = newPerson.run {
        println("Engine starting...")
        println("...")
        println("...")
        400
    }

    println(startEngine)

    val result = with(newPerson) {
        age = 20
        name = "Krzysiek"
        incAge()
        addConstToSurname()
        20f
    }

}