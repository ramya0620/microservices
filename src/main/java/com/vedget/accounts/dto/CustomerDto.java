package com.vedget.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Schema(name="Customer",
        description = "Schema to hold Customer & Account information")
public class CustomerDto {

    @NotEmpty(message="name can not be empty or null")
    @Size(min=3,max=30,message="length of the name should be between 3 and 30")
    @Schema(description = "name of the Customer",example="ramya")
    public String name;

    @NotEmpty(message="email can not be empty or null")
    @Email(message = "email address should be valid value")
    @Schema(description = "email of the Customer",example="ramya@vedget.com")
    public String email;

    @Pattern(regexp="(^$|[0-9]{10})",message="mobile number should be 10 digits")
    @Schema(description = "mobileNumber of the Customer",example="9876543210")
    public String mobileNumber;

    @Schema(description = "Account details of the Customer")
    public AccountsDto accountsDto;
}
