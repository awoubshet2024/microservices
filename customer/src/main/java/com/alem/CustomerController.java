package com.alem;

import com.alem.model.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;


@RestController
public class CustomerController {
    private final AtomicLong counter = new AtomicLong();
    @GetMapping("/greeting")
    public Greeting getGreeting(@RequestParam(value="name",defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format("Hello %s! " ,name));
    }
}
