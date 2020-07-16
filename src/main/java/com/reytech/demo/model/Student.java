package com.reytech.demo.model;

import java.time.LocalDate;
import java.util.List;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;

public class Student {

    @NotEmpty(message = "{validation.name.NotEmpty}")
    @Size(min = 2, max = 50, message = "{validation.name.Size}")
    private String name;

    @NotNull(message = "{validation.age.NotNull}")
    @Positive(message = "{validation.age.Positive}")
    @Max(value = 18, message = "{validation.age.Maximum}")
    private Integer age;

    @NotEmpty(message = "{validation.email.NotEmpty}")
    @Email(message = "{validation.email.Type}")
    private String email;

    @NotEmpty(message = "{validation.subjects.NotEmpty}")
    private List <String> subjects;

    @NotNull(message = "{validation.birthDate.NotNull}")
    @Past(message = "{validation.birthDate.Past}")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate birthDate;

    @NotEmpty(message = "{validation.gender.NotEmpty}")
    private String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List <String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List <String> subjects) {
        this.subjects = subjects;
    }

}