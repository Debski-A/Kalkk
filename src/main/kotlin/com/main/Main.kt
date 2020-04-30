package com.main

import javafx.application.Application
import tornadofx.*

class Main: App(MyView::class)

class MyView: View() {

    override var root = vbox {
        hbox {
            button("Press Me") {
                action {
                    println("pressed!")
                }
            }
            button("Press Me Too") {
                action {
                    println("pressed too!")
                }
            }

        }
        label("Waiting")
    }
}

fun main(args: Array<String>) {
    Application.launch(Main::class.java, *args)
}


