package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //define that class is entity class
@Table(name="user") //assign the table name
@AllArgsConstructor
@NoArgsConstructor
@Data //getter setter two string
public class UserEntity {
    @Id //define the primary key
    //define the column in table
    @Column(name="user_id", length = 10 )
    @GeneratedValue(strategy = GenerationType.AUTO) //auto generate the id
    private int userID;

    @Column(name="user_name",nullable = false,length = 100)
    private String userName;

    @Column(name="email",nullable = false,unique = true ,length = 50)
    private String email;



    public UserEntity(String email, String userName) {
        this.email = email;
        this.userName = userName;
    }


}
