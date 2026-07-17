package com.kashish.demo.StudentServer;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentServer(@RequestBody Student student) {
    //Store the student method;
    @PostMapping("/create")
    public String storeStudent(){
        return "id: 1\n" +
                "Name: Kashish\n" +
                "Department: CSE\n" +
                "Age: 22\n" ;

    }
    //Read the student with id

    //update the student information

    //delete the student information

}
