package com.vedget.accounts.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class Customer extends BaseEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    public Long customerId;
    @Column(name="name")
    public String name;
    @Column(name="email")
    public String email;
    @Column(name="mobile_number")
    public String mobileNumber;
}
