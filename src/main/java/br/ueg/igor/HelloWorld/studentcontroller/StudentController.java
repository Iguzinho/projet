package br.ueg.igor.HelloWorld.studentcontroller;

import br.ueg.igor.HelloWorld.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(path = "/student")
public class StudentController {

    @GetMapping
    public List<Student> ListAll(){

        Student student = new Student();
        student.setId(1L);
        student.setName("Student1");
        student.setRegisterNumber("15");
        student.setCourse("SI");
        student.setRegisterDate(LocalDate.now());

        Student student2 = Student.builder()
                .id(2L)
                .name("Student2")
                .registerNumber("12")
                .registerDate(LocalDate.now())
                .course("SI")
                .build();
        List<Student> students = Arrays.asList(student, student2);
        return students;
    }
}
