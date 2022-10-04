package com.example.bpcmdsex03.student;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class StudentController {

    @GetMapping("/student")
    public String getMe(@RequestParam(defaultValue = "Natálie Vychodilová") String name, @RequestParam(defaultValue = "230911") Integer id){
        return "Student: <b>" + name + "</b> ID: <b>" + id + "</b>";
    }

    @GetMapping("/students")
    public String getStudents(@RequestParam(defaultValue = "-1") Integer vutid){
        if(vutid == -1){
            ListOfStudents students = new ListOfStudents();
            return students.toString();
        }
        ListOfStudents students = new ListOfStudents();
        Optional<Student> result = students.getStudents().stream().filter(item -> item.getId() == vutid).findFirst();
        if (result.isEmpty()) return "Nenalezeno nic";
        else return result.get().toString();

    }


}
