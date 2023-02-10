package _2_Programowanie_obiektowe_w_Kotlinie

class Worker(val name: String,
             val surname: String,
             var experience: Int,
             var salary: Int)

class Manager(){
    private val workersList = ArrayList<Worker>()

    fun addNewWorker(worker: Worker): Boolean {
        return workersList.add(worker)
    }

    fun removeWorker(worker: Worker): Boolean {
        return workersList.remove(worker)
    }
}
fun main(args: Array<String>) {

    val worker1 = Worker(name = "John", surname = "Smith")

    ZACZĄĆ OD 5 MINUTY!!

}