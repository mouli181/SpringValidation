package com.example.demovalidation.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "Name cannot be blank")
    @Size(min = 3, message = "Name must be at least 3 characters long")
    @Column(nullable = false)
    private String name;

    @NotBlank(message = "Email cannot be blank")
    @Email(message = "Email should be valid")
    @Column(nullable = false, unique = true)
    private String email;

    @NotNull(message = "Age cannot be null")
    @Min(value = 18, message = "Age must be at least 18")
    private Integer age;

    public User(Long id, String name, String email, Integer age) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "Name cannot be blank") @Size(min = 3, message = "Name must be at least 3 characters long") String getName() {
        return name;
    }

    public void setName(@NotBlank(message = "Name cannot be blank") @Size(min = 3, message = "Name must be at least 3 characters long") String name) {
        this.name = name;
    }

    public @NotBlank(message = "Email cannot be blank") @Email(message = "Email should be valid") String getEmail() {
        return email;
    }

    public void setEmail(@NotBlank(message = "Email cannot be blank") @Email(message = "Email should be valid") String email) {
        this.email = email;
    }

    public @NotNull(message = "Age cannot be null") @Min(value = 18, message = "Age must be at least 18") Integer getAge() {
        return age;
    }

    public void setAge(@NotNull(message = "Age cannot be null") @Min(value = 18, message = "Age must be at least 18") Integer age) {
        this.age = age;
    }

    public User(){

    }

}
