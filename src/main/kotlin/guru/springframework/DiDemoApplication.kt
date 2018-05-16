package guru.springframework

import guru.springframework.controllers.ConstructorInjectedController
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

import guru.springframework.controllers.MyController
import guru.springframework.controllers.PropertyInjectedController
import guru.springframework.controllers.SetterInjectedController

@SpringBootApplication
class DiDemoApplication

fun main(args: Array<String>) {
    val ctx = runApplication<DiDemoApplication>(*args)

    val controller = ctx.getBean("myController") as MyController

    println(controller.hello())
    println(ctx.getBean(PropertyInjectedController::class.java).sayHello())
    println(ctx.getBean(SetterInjectedController::class.java).sayHello())
    println(ctx.getBean(ConstructorInjectedController::class.java).sayHello())
}
