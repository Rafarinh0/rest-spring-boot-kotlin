package br.com.estudo.rest_spring_boot_kotlin

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestParam
import java.util.concurrent.atomic.AtomicLong

@RestController
class GreetingController {

    val counter: AtomicLong = AtomicLong();

    @RequestMapping("/greeting")
    fun greeting(@RequestParam(value="name", defaultValue = "word") name: String?): Greeting {
        return Greeting(counter.incrementAndGet(), "Hello $name!")
    }
}