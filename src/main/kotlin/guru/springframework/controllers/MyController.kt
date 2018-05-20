package guru.springframework.controllers

import guru.springframework.services.GreetingService
import org.springframework.stereotype.Controller

@Controller
class MyController(private val greetingService: GreetingService) {
    fun hello(): String {
        println("Hello!!! ")

        return greetingService.sayGreeting()
    }
}
