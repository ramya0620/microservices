package com.vedget.accounts.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
public class AccountsDto {

    @NotEmpty(message = "accountNumber can not be empty or null")
    @Pattern(regexp="(^$|[0-9]{10})",message = "account number must be 10 digits ")
    private Long accountNumber;
   @NotEmpty(message = "accountType cannot be empty or null")
    private String accountType;
   @NotEmpty(message = "branchAddress can not be empty or null")
    private String branchAddress;
}
