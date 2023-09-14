package com.santiagoposada.restlibrarymongo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Customer {
    private String email;
    private String gender;
    private Integer age;
    private Integer satisfaction;
}
