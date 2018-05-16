package guru.springframework.services

import org.springframework.stereotype.Service

@Service
class GreetingServiceImpl: GreetingService {
    companion object {
        const val HELLO_GURUS = "Hello Gurus!!!!"
    }
    override fun sayGreeting() = HELLO_GURUS
}
