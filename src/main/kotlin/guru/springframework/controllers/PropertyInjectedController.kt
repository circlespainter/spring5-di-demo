package guru.springframework.controllers

import guru.springframework.services.GreetingServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller

@Controller
class PropertyInjectedController {
    @Autowired
    var greetingService: GreetingServiceImpl? = null

    fun sayHello() = greetingService!!.sayGreeting()
}