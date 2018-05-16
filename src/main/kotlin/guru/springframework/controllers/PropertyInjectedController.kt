package guru.springframework.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller

import guru.springframework.services.GreetingService

@Controller
class PropertyInjectedController {
    @Autowired
    var greetingServiceImpl: GreetingService? = null

    fun sayHello() = greetingServiceImpl!!.sayGreeting()
}