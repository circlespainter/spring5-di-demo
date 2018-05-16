package guru.springframework.services

class GreetingServiceImpl: GreetingService {
    companion object {
        const val HELLO_GURUS = "Hello Gurus!!!!"
    }
    override fun sayGreeting() = HELLO_GURUS
}
