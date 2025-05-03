package com.example.Student.studentController;

import com.example.Student.studentEntity.EntityStu;
import com.example.Student.studentService.Service_stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class Controller_stu {

    @Autowired
    Service_stu service;
    @PostMapping(value="/AllStudentDetails")
    //http://localhost:1991/AllStudentDetails
    public String saveAll(@Validated @RequestBody Iterable<EntityStu> stuentity)
    {
        service.addAll(stuentity);
        return "Records added";
    }

    @PostMapping(value="/StudentDetails")
    //http://localhost:1991/StudentDetails
    public String save(@Validated @RequestBody EntityStu stuentity)
    {
        service.add(stuentity);
       return "Records added";
    }
    @GetMapping(value = "/gettingAllStudents")
    //http://localhost:1991/gettingAllStudents
    public Iterable<EntityStu> gettingAllRecords()
    {
        return service.getAllRecords();

    }
    @GetMapping(value = "/gettingOneRecord/{student_Id}")
    //http://localhost:1991/gettingOneRecord/109
    public Optional<EntityStu> gettingOneRecord(@PathVariable("student_Id") Integer id)
    {
        return service.getOneRecord(id);
    }

    @DeleteMapping(value="/DeleteoneRecord/{delete_Id}")
    //http://localhost:1991/DeleteoneRecord/111
    public String deletingOneRecord(@PathVariable("delete_Id") Integer id)
    {
        service.deleteOneRecord(id);
        return "Deleted Successfully";
    }
    @DeleteMapping(value="/DeleteAllRecords")
    //http://localhost:1991/DeleteAllRecords
    public String deletingAllRecords()
    {
        service.deleteAllRecords();
        return "All Records Deleted Successfully";
    }



}
