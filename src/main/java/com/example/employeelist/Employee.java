package com.example.employeelist;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;

@Data
@NoArgsConstructor
@Entity
public class Employee {
    private long id;
    private String firstName;
    private String lastName;
}
