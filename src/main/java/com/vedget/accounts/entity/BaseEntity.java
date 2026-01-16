package com.vedget.accounts.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
@MappedSuperclass//this class will act as superclass for all the entities
@Getter @Setter @ToString
public class BaseEntity {
    @Column(updatable = false) //jpa don't have to update/create just for the time when it is updated
    private LocalDateTime createdAt;
    @Column(updatable = false)
    private String createdBy;
    @Column(updatable = false)
    private LocalDateTime updatedAt;
    @Column(updatable = false)
    private String updatedBy;
}
