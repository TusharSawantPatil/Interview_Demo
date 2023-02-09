package com.demo.test.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name ="Users_Information")
public class User {
    @Id
    @GeneratedValue(strategy =GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;
    private String Email;
    private int Age;
}






