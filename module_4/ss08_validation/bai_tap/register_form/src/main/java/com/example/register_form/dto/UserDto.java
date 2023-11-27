package com.example.register_form.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto implements Validator {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    @Min(18)
    private int age;
    @Email(message = "Please enter the correct format")
    private String Email;

    @Override
    public boolean supports(Class<?> clazz) {
        return false;
    }

    @Override
    public void validate(Object target, Errors errors) {
        UserDto userDto = (UserDto) target;
        if ("".equals(userDto.firstName)) {
            errors.rejectValue("firstName", null, "It was empty.Please enter first name");
        } else if (!(userDto.getFirstName().matches("^[A-Z][a-z]+") || userDto.firstName.length()>=3)) {
            errors.rejectValue("firstName", null, "Please enter the correct format");
        }
        if ("".equals(userDto.lastName)){
            errors.rejectValue("lastName", null, "It was empty.Please enter last name");
        }else if(!userDto.getLastName().matches("^[A-Z][a-z]+")){
            errors.rejectValue("lastName", null, "Please enter the correct format");
        }
        if("".equals(userDto.phoneNumber)){
            errors.rejectValue("phoneNumber", null, "It was empty.Please enter phoneNumber");
        }else if(!userDto.getPhoneNumber().matches("^0\\d{9}$")){
            errors.rejectValue("phoneNumber", null, "Please enter the correct format");
        }
    }
}
