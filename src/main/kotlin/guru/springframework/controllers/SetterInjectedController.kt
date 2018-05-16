package guru.springframework.controllers

import guru.springframework.services.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller

@Controller
class SetterInjectedController {
    private var greetingService: GreetingService? = null

    @Autowired
    fun setGreetingService(greetingService: GreetingService) {
        this.greetingService = greetingService
    }

    fun sayHello() = greetingService!!.sayGreeting()
}
