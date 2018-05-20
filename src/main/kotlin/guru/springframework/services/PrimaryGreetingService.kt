package guru.springframework.services

import org.springframework.context.annotation.Primary
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Primary
@Profile("en", "default")
class PrimaryGreetingService: GreetingService {
    override fun sayGreeting() = "Hello - Primary Greeting service"
}
