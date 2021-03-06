package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    @Column(columnDefinition = "enum('male', 'famale')")
    private String sex;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "teacher_student", joinColumns = {@JoinColumn(name = "s_id")}, inverseJoinColumns = {@JoinColumn(name = "t_id")})
    private Set<Teacher> teachers;
}
