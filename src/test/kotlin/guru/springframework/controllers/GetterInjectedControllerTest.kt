package guru.springframework.controllers

import guru.springframework.services.GreetingServiceImpl

import org.junit.Before
import org.junit.Test
import org.junit.Assert.assertEquals

class GetterInjectedControllerTest {
    private var getterInjectedController: GetterInjectedController? = null

    @Before
    fun setUp() {
        this.getterInjectedController = GetterInjectedController()
        this.getterInjectedController!!.setGreetingService(GreetingServiceImpl())
    }

    @Test
    fun testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, getterInjectedController!!.sayHello())
    }
}
