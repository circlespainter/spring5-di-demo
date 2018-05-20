package guru.springframework.services

import org.springframework.stereotype.Service

@Service
class GetterGreetingService : GreetingService {
    override fun sayGreeting(): String {
        return "Hello - I was injected by the getter"
    }
}
