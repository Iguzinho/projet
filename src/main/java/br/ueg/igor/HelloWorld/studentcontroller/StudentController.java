package br.ueg.igor.HelloWorld.studentcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

    @GetMapping
    public String ListAll(){
        return "List of students";
    }
}
