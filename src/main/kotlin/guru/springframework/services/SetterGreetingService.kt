package guru.springframework.services

import org.springframework.stereotype.Service

@Service
class SetterGreetingService: GreetingService {
    override fun sayGreeting() = "Hello - I was injected by the setter"
}
