package guru.springframework.controllers

import guru.springframework.services.GreetingServiceImpl

import org.junit.Before
import org.junit.Test
import org.junit.Assert.assertEquals

class ConstructorInjectedControllerTest {
    private var constructorInjectedController: ConstructorInjectedController? = null

    @Before
    fun setUp() {
        this.constructorInjectedController = ConstructorInjectedController(GreetingServiceImpl())
    }

    @Test
    fun testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, constructorInjectedController!!.sayHello())
    }
}
