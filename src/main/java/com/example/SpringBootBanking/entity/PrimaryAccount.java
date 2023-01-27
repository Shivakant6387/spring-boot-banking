package com.example.SpringBootBanking.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "primary_account")
public class PrimaryAccount {
    @Id
    @Column(name = "account_id")
    private String accountID;
    @Column(name = "account_number")
    private int accountNumber;
    @Column(name = "account_balance")
    private int accountBalance;
}
