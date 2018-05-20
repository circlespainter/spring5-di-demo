package guru.springframework.controllers

import guru.springframework.services.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

@Controller
class GetterInjectedController {
    private var greetingService: GreetingService? = null

    fun sayHello(): String {
        return greetingService!!.sayGreeting()
    }

    @Autowired
    fun setGreetingService(@Qualifier("getterGreetingService") greetingService: GreetingService) {
        this.greetingService = greetingService
    }
}
