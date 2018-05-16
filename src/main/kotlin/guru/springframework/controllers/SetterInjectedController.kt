package guru.springframework.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller

import guru.springframework.services.GreetingService
import org.springframework.beans.factory.annotation.Qualifier

@Controller
class SetterInjectedController {
    private var greetingService: GreetingService? = null

    @Autowired
    fun setGreetingService(@Qualifier("setterGreetingService") greetingService: GreetingService) {
        this.greetingService = greetingService
    }

    fun sayHello() = greetingService!!.sayGreeting()
}
