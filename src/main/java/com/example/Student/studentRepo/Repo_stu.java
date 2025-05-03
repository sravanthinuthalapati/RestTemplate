package com.example.Student.studentRepo;

import com.example.Student.studentEntity.EntityStu;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repo_stu extends CrudRepository<EntityStu,Integer>
{


}
