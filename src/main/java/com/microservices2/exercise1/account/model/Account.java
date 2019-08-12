package com.microservices2.exercise1.account.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "ACCOUNTS")
@Entity
@EqualsAndHashCode
public class Account implements Serializable {

    private static final long serialVersionUID = 6477159315301663811L;

    @Id
    @Column(name = "ACCOUNTID")
    private Integer accountId;

    @Column(name = "BALANCE")
    private Double balance;

    @Column(name = "CUSTOMERID")
    private Integer customerId;

    @Column(name = "ACCOUNTTYPE")
    private String accountType;

    @Column(name = "BRANCHCODE")
    private String branchCode;

    @Column(name = "BANK")
    private String bank;
}
