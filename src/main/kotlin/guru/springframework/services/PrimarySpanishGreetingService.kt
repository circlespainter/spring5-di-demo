package guru.springframework.services

import org.springframework.context.annotation.Primary
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile("es")
@Primary
class PrimarySpanishGreetingService: GreetingService {
    override fun sayGreeting() = "Servicio de Saludo Primario"
}
