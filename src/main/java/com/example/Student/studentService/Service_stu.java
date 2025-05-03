package com.example.Student.studentService;

import com.example.Student.studentEntity.EntityStu;
import com.example.Student.studentRepo.Repo_stu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Service_stu {

    @Autowired
    Repo_stu repo;
    public void addAll(Iterable<EntityStu> stuentity)
    {

         repo.saveAll(stuentity);
    }


    public void add(EntityStu stuentity)
    {

        repo.save(stuentity);
    }
    public Iterable<EntityStu> getAllRecords()
    {
    return repo.findAll();
    }
    public Optional<EntityStu> getOneRecord(Integer stu_Id)
    {
        return repo.findById(stu_Id);
    }
    public void deleteOneRecord(Integer stu_Id)
    {
        repo.deleteById(stu_Id);
    }
    public void deleteAllRecords()
    {
        repo.deleteAll();
    }



}
