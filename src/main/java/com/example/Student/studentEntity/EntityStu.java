package com.example.Student.studentEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class EntityStu {
    @Id
    @Column
    private int id;
    @Column
    private String name;
    @Column
    private String college;

    public EntityStu(int id, String name, String college) {
        this.id = id;
        this.name = name;
        this.college = college;
    }

    public EntityStu() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}

