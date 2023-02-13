package _2_Programowanie_obiektowe_w_Kotlinie

class Worker(
    val name: String,
    val surname: String,
    var experience: Int,
    var salary: Int
)

class Manager() {
    private val workersList = ArrayList<Worker>()

    fun addNewWorker(worker: Worker): Boolean {
        return workersList.add(worker)
    }

    fun addAllWorkers(list: List<Worker>): Boolean {
        return workersList.addAll(list)
    }

    fun removeWorker(worker: Worker): Boolean {
        return workersList.remove(worker)
    }

    fun getAverageSalary(): Float {
        val sum = getSumOfSalaries()
        val workersNumber = workersList.size

        return sum.toFloat()/workersNumber
    }

    fun printWorkersData(){
        println("-------------------")
        for (worker in workersList){
            println("${worker.name} ${worker.surname}")
            println("Salary: ${worker.salary}")
            println("Experience: ${worker.experience}")
            println("-------------------------")

        }
    }

    private fun getSumOfSalaries(): Int {
        var sum = 0
        for (worker in workersList) {
            sum += worker.salary
        }
        return sum
    }
}

fun main(args: Array<String>) {

    val worker1 = Worker(name = "John", surname = "Smith", experience = 8, salary = 10_000)
    val worker2 = Worker(name = "Ken", surname = "Smith", experience = 3, salary = 3500)
    val worker3 = Worker(name = "JJ", surname = "Barry", experience = 12, salary = 15_000)
    val worker4 = Worker(name = "Marry", surname = "Jones", experience = 11, salary = 14_000)

    val workersList = listOf(worker1, worker2, worker3, worker4)

    val manager = Manager()

    manager.addAllWorkers(workersList)

    val averageSalary = manager.getAverageSalary()
    println("Average salary: $averageSalary")

    println("Few months later...")
    manager.removeWorker(worker2)

    val newAverageSalary = manager.getAverageSalary()
    println("Average salary: $newAverageSalary")

    manager.printWorkersData()

}