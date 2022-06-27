package com.example.springbootmapstruct.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Address implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long addressId;

    private String address;

    @Temporal(TemporalType.TIMESTAMP)
    private Date addressUpdate;


    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
}