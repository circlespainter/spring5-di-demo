package guru.springframework.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller

import guru.springframework.services.GreetingService
import org.springframework.beans.factory.annotation.Qualifier

@Controller
class PropertyInjectedController {
    @Autowired
    @Qualifier("greetingServiceImpl")
    var greetingServiceImpl: GreetingService? = null

    fun sayHello() = greetingServiceImpl!!.sayGreeting()
}