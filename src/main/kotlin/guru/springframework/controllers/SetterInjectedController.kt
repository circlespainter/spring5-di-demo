package guru.springframework.controllers

import guru.springframework.services.GreetingService

class SetterInjectedController {
    private var greetingService: GreetingService? = null

    fun setGreetingService(greetingService: GreetingService) {
        this.greetingService = greetingService
    }

    fun sayHello() = greetingService!!.sayGreeting()
}
