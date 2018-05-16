package guru.springframework.controllers

import guru.springframework.services.GreetingService

class ConstructorInjectedController(private val greetingService: GreetingService) {
    fun sayHello() = greetingService.sayGreeting()
}
