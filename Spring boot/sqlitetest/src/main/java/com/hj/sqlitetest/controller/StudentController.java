package com.hj.sqlitetest.controller;

import com.hj.sqlitetest.bean.Student;
import com.hj.sqlitetest.repo.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students/")
public class StudentController {
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("list")
    public List<Student> getStudents(){
        return studentRepository.findAll();
    }
    @PostMapping("add_student")
    public Student addStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }
    @GetMapping("{id}")
    public Student getById(@PathVariable String id)
    {
        Integer sid = Integer.parseInt(id);
        System.out.println("id"+id);
        return  studentRepository.findById(sid).get();
    }
    @RequestMapping(method=RequestMethod.DELETE, value="{id}")
    public void deleteById(@PathVariable String id)
    {
        Integer sid = Integer.parseInt(id);
        System.out.println("id"+sid+" "+id);
         studentRepository.deleteById(sid);
    }
    @GetMapping("findByName/{name}")
    public List<Student> findByName(@PathVariable String name){
        return studentRepository.findByName(name);
    }
}
