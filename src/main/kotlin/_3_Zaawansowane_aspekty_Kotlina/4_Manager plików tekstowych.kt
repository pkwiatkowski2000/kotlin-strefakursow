import java.io.File
import java.io.FileOutputStream
import java.io.FileReader
import java.lang.IllegalArgumentException
import kotlin.system.exitProcess

fun main() {
    val fm = MyFileManager()

    while (true){
        showMenu()
        performFileOperation(fm = fm, opt = getUserInput())
    }

}

fun performFileOperation(fm: MyFileManager, opt: Int) {
    when (opt) {
        1 -> performOpenFile(fm)
        2 -> performWriteFile(fm)
        3 -> performDeleteFile(fm)
        4 -> exitProcess(0)
    }

}

fun performDeleteFile(fm: MyFileManager) {
    fm.delete(
        path = setFilePath(),
        onFailure = { println(it) },
        onCompleted = { isSuccess ->
            if (isSuccess) println("Poprawnie usunieto plik")
            else println("Cos poszlo nie tak")
        }
    )
}

fun performWriteFile(fm: MyFileManager) {
    println("Wprowadz tekst >>")
    val text = readLine()!!.toString()
    fm.write(path = setFilePath(), text = text)
}

fun performOpenFile(fm: MyFileManager) {
    fm.open(
        path = setFilePath(),
        onFailure = { println(it) },
        onCompleted = { lines -> fm.printFile(lines) }
    )
}

interface FileManagerInterface {
    fun open(
        path: String,
        onFailure: (Exception) -> Unit,
        onCompleted: (List<String>) -> Unit
    )

    fun delete(
        path: String,
        onFailure: (Exception) -> Unit,
        onCompleted: (Boolean) -> Unit
    )

    fun write(path: String, text: String)

    fun printFile(lines: List<String>)
}

class MyFileManager : FileManagerInterface {
    override fun open(
        path: String,
        onFailure: (Exception) -> Unit,
        onCompleted: (List<String>) -> Unit
    ) {

        var fileReader: FileReader? = null
        try {
            fileReader = FileReader(path)
            fileReader.readLines()?.let { onCompleted(it) }

        } catch (e: Exception) {
            onFailure(e)
        } finally {
            fileReader?.close()
        }

    }

    override fun delete(
        path: String,
        onFailure: (Exception) -> Unit,
        onCompleted: (Boolean) -> Unit
    ) {
        val file = File(path)
        try {
            val result = file.delete()
            onCompleted(result)
        } catch (e: Exception) {
            onFailure(e)
        }
    }

    override fun write(
        path: String,
        text: String
    ) {
        val file = File(path)
        FileOutputStream(file).use { out ->
            out.write(text.toByteArray())
        }

    }

    override fun printFile(lines: List<String>) {
        for (line in lines) {
            println(line)
        }
    }

}

fun getUserInput(): Int {
    print("Wybierz opcje >> ")
    while (true) {
        try {
            val input = readLine()!!.toInt()
            if (input !in 1..4) throw IllegalArgumentException("Liczba spoza zakresu")
            return input
        } catch (e: Exception) {
            println(e)
        }
    }
}

fun showMenu() {
    println("Menu")
    println("1. Otworz plik")
    println("2. Zapis do pliku")
    println("3. Usun plik")
    println("4. Wyjdz")
}

fun setFilePath(): String {
    print("Wskaz sciezke do pliku: ")
    return readLine()!!.toString()
}


