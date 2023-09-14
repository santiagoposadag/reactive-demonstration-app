package com.santiagoposada.libraryreactive.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Product {
    private String name;
    private Double price;
    private List<String> tags;
    private Integer quantity;

    @Override
    public String toString() {
        return "\nProduct{" +
                "\nname='" + name + '\'' +
                ", \nprice=" + price +
                ", \ntags=" + tags +
                ", \nquantity=" + quantity +
                '}';
    }
}

