package guru.springframework.controllers

import org.junit.Before
import org.junit.Test

import org.junit.Assert.assertEquals

import guru.springframework.services.GreetingServiceImpl

class PropertyInjectedControllerTest {
    private var propertyInjectedController: PropertyInjectedController? = null

    @Before fun setUp() {
        propertyInjectedController = PropertyInjectedController()
        propertyInjectedController!!.greetingService = GreetingServiceImpl()
    }

    @Test fun testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, propertyInjectedController!!.sayHello())
    }
}
