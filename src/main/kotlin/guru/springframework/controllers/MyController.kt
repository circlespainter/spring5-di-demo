package guru.springframework.controllers

import org.springframework.stereotype.Controller

@Controller
class MyController {
    fun hello(): String {
        println("Hello")
        return "hello"
    }
}
