package guru.springframework.services

import org.springframework.context.annotation.Primary
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Primary
@Profile("en", "default")
class PrimaryGreetingService : GreetingService {
    private val greetingRepository: GreetingRepository? = null

    override fun sayGreeting(): String {
        return greetingRepository!!.englishGreeting
    }
}
