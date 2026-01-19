package com.vedget.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Column;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
@Schema(name="Accounts",
        description = "Schema to hold Account information")
@Data
public class AccountsDto {

    @NotEmpty(message = "accountNumber can not be empty or null")
    @Pattern(regexp="(^$|[0-9]{10})",message = "account number must be 10 digits ")
    @Schema(description ="Account NUmber of VegetBank",example = "8283692673")
    private Long accountNumber;

    @NotEmpty(message = "accountType cannot be empty or null")
    @Schema(description ="Account type of VegetBank",example = "Savings")
    private String accountType;

    @NotEmpty(message = "branchAddress can not be empty or null")
    @Schema(description ="branchAddress of VegetBank",example = "123 New Jersey")
    private String branchAddress;
}
