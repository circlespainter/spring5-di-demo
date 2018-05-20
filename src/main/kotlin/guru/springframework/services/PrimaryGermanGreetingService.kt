package guru.springframework.services

import org.springframework.context.annotation.Primary
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile("de")
@Primary
class PrimaryGermanGreetingService: GreetingService {
    override fun sayGreeting() = "Primärer Begrüßungsdienst"
}
