package com.thoughtworks.training.springdata.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
@Data
public class School {

    @Id
    @GeneratedValue
    @JsonIgnore
    private Integer id;

    private String name;


    @OneToMany(mappedBy = "school")
    @JsonBackReference
    private List<Student> students;
}