package com.eazybytes.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Schema(
        name = "Customer",
        description = "Schema to hold Customer and Account information"
)
public class CustomerDto {

    @NotEmpty(message = "Name can not be a null or empty")
    @Size(min=5, max=30, message="The length of the customer name should be between 5 and 30")
    @Schema(description = "Name of the customer", example = "Eazy Bytes")
    private String name;

    @NotEmpty(message = "Email address can not be a null or empty")
    @Email(message = "Email address should be a valid value")
    @Schema(
            description = "Email address of the customer", example = "tutor@eazybytes.com"
    )
    private String email;

    @Pattern(regexp="(^$|[0-9]{10})",message = "Mobile number must be 10 digits")
    @Schema(
            description = "Mobile Number of the customer", example = "9345432123"
    )
    private String mobileNumber;

    @Schema(name = "account",
            description = "Account details of the Customer"
    )
    private AccountsDto accountsDto;

}
