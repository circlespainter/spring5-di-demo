package guru.springframework.controllers

import guru.springframework.services.GreetingService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.stereotype.Controller

@Controller
class PropertyInjectedController {
    @Autowired
    @Qualifier("greetingServiceImpl")
    var greetingServiceImpl: GreetingService? = null

    fun sayHello(): String {
        return greetingServiceImpl!!.sayGreeting()
    }
}
