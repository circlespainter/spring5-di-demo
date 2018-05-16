package guru.springframework.controllers

import org.junit.Before
import org.junit.Test

import org.junit.Assert.assertEquals

import guru.springframework.services.GreetingServiceImpl

class SetterInjectedControllerTest {
    private var setterInjectedController: SetterInjectedController? = null

    @Before fun setUp() {
        setterInjectedController = SetterInjectedController()
        setterInjectedController!!.setGreetingService(GreetingServiceImpl())
    }

    @Test fun testGreeting() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS, setterInjectedController!!.sayHello())
    }
}
