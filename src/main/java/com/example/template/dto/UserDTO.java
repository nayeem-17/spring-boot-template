package com.example.template.dto;

import com.example.template.model.User;
import lombok.*;

@Data
public class UserDTO {

    private String name;
    private String password;

    public static UserDTO userDTOMapping(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setName(user.getName());
        userDTO.setPassword(userDTO.getPassword());
        return userDTO;
    }
}
