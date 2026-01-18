package com.vedget.accounts.dto;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class CustomerDto {

    public String name;
    public String email;
    public String mobileNumber;
    public AccountsDto accountsDto;
}
