package _2_Programowanie_obiektowe_w_Kotlinie

import java.awt.event.MouseEvent
import java.awt.event.MouseListener
import javax.swing.JFrame

// Singleton używamy, gdy chcemy użyć obiektu/klasy tylko raz w całym programie

object MySingleton{


}

class MyClass{
    companion object{
        const val MY_INT = 10

    }    }

fun main(args: Array<String>) {

    val jFrame = JFrame()
    jFrame.addMouseListener(object : MouseListener {
        override fun mouseClicked(e: MouseEvent?) {
            println("Click!")
        }

        override fun mousePressed(e: MouseEvent?) {

        }

        override fun mouseReleased(e: MouseEvent?) {

        }

        override fun mouseEntered(e: MouseEvent?) {

        }

        override fun mouseExited(e: MouseEvent?) {

        }

    })
    jFrame.isVisible = true

    MyClass.MY_INT

}

