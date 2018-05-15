package guru.springframework

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

import guru.springframework.controllers.MyController

@SpringBootApplication
class DiDemoApplication

fun main(args: Array<String>) {
    val ctx = runApplication<DiDemoApplication>(*args)
    val controller = ctx.getBean("myController") as MyController
    controller.hello()
}
