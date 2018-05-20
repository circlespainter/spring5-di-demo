package guru.springframework.controllers

import guru.springframework.services.GreetingServiceImpl

import org.junit.Before
import org.junit.Test
import org.junit.Assert.assertEquals

class PropertyInjectedControllerTest {
    private var propertyInjectedController: PropertyInjectedController? = null

    @Before
    fun setUp() {
        this.propertyInjectedController = PropertyInjectedController()
        this.propertyInjectedController!!.greetingServiceImpl = GreetingServiceImpl()
    }

    @Test
    fun testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController!!.sayHello())
    }
}
