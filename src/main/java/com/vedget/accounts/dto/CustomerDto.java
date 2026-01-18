package com.vedget.accounts.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class CustomerDto {

    @NotEmpty(message="name can not be empty or null")
    @Size(min=3,max=30,message="length of the name should be between 3 and 30")
    public String name;
    @NotEmpty(message="email can not be empty or null")
    @Email(message = "email address should be valid value")
    public String email;

    @Pattern(regexp="(^$|[0-9]{10})",message="mobile number should be 10 digits")
    public String mobileNumber;

    public AccountsDto accountsDto;
}
