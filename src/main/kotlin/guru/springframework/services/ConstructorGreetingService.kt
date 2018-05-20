package guru.springframework.services

import org.springframework.stereotype.Service

@Service
class ConstructorGreetingService : GreetingService {
    override fun sayGreeting(): String {
        return "Hello - I was injected via the constructor!!!"
    }
}
