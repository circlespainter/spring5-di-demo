package guru.springframework.controllers

import guru.springframework.services.GreetingServiceImpl

class PropertyInjectedController {
    var greetingService: GreetingServiceImpl? = null

    fun sayHello() = greetingService!!.sayGreeting()
}