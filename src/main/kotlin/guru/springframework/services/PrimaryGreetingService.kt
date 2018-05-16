package guru.springframework.services

import org.springframework.context.annotation.Primary
import org.springframework.stereotype.Service

@Service
@Primary
class PrimaryGreetingService: GreetingService {
    override fun sayGreeting() = "Hello - Primary Greeting service"
}
