package guru.springframework

import guru.springframework.controllers.ConstructorInjectedController
import guru.springframework.controllers.GetterInjectedController
import guru.springframework.controllers.MyController
import guru.springframework.controllers.PropertyInjectedController
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class DiDemoApplication

fun main(args: Array<String>) {
    val ctx = SpringApplication.run(DiDemoApplication::class.java, *args)

    val controller = ctx.getBean("myController") as MyController

    println(controller.hello())
    println(ctx.getBean(PropertyInjectedController::class.java).sayHello())
    println(ctx.getBean(GetterInjectedController::class.java).sayHello())
    println(ctx.getBean(ConstructorInjectedController::class.java).sayHello())
}
