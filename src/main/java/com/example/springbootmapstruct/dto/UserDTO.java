package com.example.springbootmapstruct.dto;

import com.example.springbootmapstruct.model.Address;
import lombok.Data;

import java.util.List;


@Data
public class UserDTO {

    private String firstName;

    private String lastName;

    private String email;

    private List<Address> addressList;




}
