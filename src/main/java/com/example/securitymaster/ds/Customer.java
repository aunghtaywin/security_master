package com.example.securitymaster.ds;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotBlank(message = "code cannot be blank!")
    @Size(min = 2, max = 5, message = "code must be between 2 and 5.")
    @Pattern(regexp = "[A-Za-z]*",message = "code cannot contains illegal characters.")
    private String code;

    @NotBlank(message = "first name cannot be empty!")
    @Pattern(regexp = "[A-Za-z-]*", message = "first name cannot contains illegal characters.")
    private String firstName;

    @NotBlank(message = "last name cannot be empty!")
    @Pattern(regexp = "[A-Za-z-]*",message = "last name cannot contains illegal characters.")
    private String lastName;

    @NotBlank(message = "Address cannot be empty!")
    @Pattern(regexp = "[\\w .\\-/,]*",message = "Address cannot contains illegal characters.")
    private String address;


    public Customer (){

    }

    public Customer(String code, String firstName, String lastName, String address) {
        this.code = code;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
}
