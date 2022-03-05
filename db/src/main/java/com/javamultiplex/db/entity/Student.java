package com.javamultiplex.db.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Rohit Agarwal on 23/02/22 11:25 PM
 * @copyright www.javamultiplex.com
 */
@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "STUDENT_ID")
    private Long id;

    @Column(name = "STUDENT_NAME")
    private String name;

    @Column(name = "STUDENT_ADDRESS")
    private String address;

    public Student(String name, String address) {
        this.name = name;
        this.address = address;
    }
}