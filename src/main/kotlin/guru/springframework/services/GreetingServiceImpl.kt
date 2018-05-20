package guru.springframework.services

import org.springframework.stereotype.Service

@Service
class GreetingServiceImpl : GreetingService {
    override fun sayGreeting(): String {
        return HELLO_GURUS
    }

    companion object {
        const val HELLO_GURUS = "Hello Gurus!!!! - Original"
    }
}
