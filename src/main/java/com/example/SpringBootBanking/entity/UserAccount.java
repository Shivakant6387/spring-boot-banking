package com.example.SpringBootBanking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@ToString
@Table(name = "user_account")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAccount {
    @Id
    @Column(name = "customer_Id")
    private String customerID;

    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;


}
