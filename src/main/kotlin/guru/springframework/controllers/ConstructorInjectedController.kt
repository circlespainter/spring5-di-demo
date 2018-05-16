package guru.springframework.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

import guru.springframework.services.GreetingService

@Controller
class ConstructorInjectedController @Autowired constructor(@Qualifier("constructorGreetingService") private val greetingService: GreetingService) {
    fun sayHello() = greetingService.sayGreeting()
}
