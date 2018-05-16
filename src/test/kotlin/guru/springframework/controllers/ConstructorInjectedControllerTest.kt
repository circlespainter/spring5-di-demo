package guru.springframework.controllers

import org.junit.Before
import org.junit.Test

import org.junit.Assert.assertEquals

import guru.springframework.services.GreetingServiceImpl

class ConstructorInjectedControllerTest {
    private var constructorInjectedController: ConstructorInjectedController? = null

    @Before fun setUp() {
        constructorInjectedController = ConstructorInjectedController(GreetingServiceImpl())
    }

    @Test fun testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController!!.sayHello())
    }
}
