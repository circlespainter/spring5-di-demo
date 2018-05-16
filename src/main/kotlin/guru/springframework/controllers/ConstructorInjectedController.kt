package guru.springframework.controllers

import guru.springframework.services.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller

@Controller
class ConstructorInjectedController @Autowired constructor(private val greetingService: GreetingService) {
    fun sayHello() = greetingService.sayGreeting()
}
