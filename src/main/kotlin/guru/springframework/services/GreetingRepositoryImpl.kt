package guru.springframework.services

class GreetingRepositoryImpl : GreetingRepository {
    override val englishGreeting: String
        get() = "Hello - Primary Greeting service"

    override val spanishGreeting: String
        get() = "Servicio de Saludo Primario"

    override val germanGreeting: String
        get() = "Primärer Grußdienst"
}
