package com.example.dto;

import lombok.Data;

import javax.validation.constraints.*;
import java.io.Serializable;

@Data
public class UserReqDTO implements Serializable {

    @NotEmpty(message = "Name shouldn't be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    private String name;

    @Min(value = 0, message = "Age should be greater than 0")
    private int age;

    @NotEmpty(message = "Email shouldn't be empty")
    @Email(message = "Email should be valid")
    private String email;

    @NotEmpty(message = "Username shouldn't be empty")
    @Size(min = 3, message = "Username should be at least 3 characters")
    private String username;

    @NotEmpty(message = "Password shouldn't be empty")
    @Size(min = 3, message = "Password should be at least 3 characters")
    private String password;

    @NotEmpty
    private String[] rolesNames;
}
