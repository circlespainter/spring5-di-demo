package guru.springframework.controllers

import guru.springframework.services.GreetingService
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

@Controller
class ConstructorInjectedController(@param:Qualifier("constructorGreetingService") private val greetingService: GreetingService) {
    fun sayHello(): String {
        return greetingService.sayGreeting()
    }
}
