package br.ueg.igor.HelloWorld.hellocontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/HelloWorld")
public class HelloController {
    @GetMapping(path = "/{name}")
    public String hello() {
        return "Hello, World!";
    }
}
