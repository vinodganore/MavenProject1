package org.vinod.ganore.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.vinod.ganore.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class StudentController {

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public List<Student> getStudents()
    {
        return Arrays.asList(
                 new Student("S100","Vinod","ILP-2012","JavaTech" ),
                 new Student("S101","Mahendar","ILP-2012","Spring" ),
                 new Student("S102","Navi","ILP-2012","Hadoop" ),
                 new Student("S103","Rao","ILP-2012",".Net" ),
                 new Student("S104","Hareesh","ILP-2012",".Net")
        );
    }
}
