package com.santiagoposada.libraryreactive.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Data
@NoArgsConstructor
@Document
public class Sales {
    @Id
    private Date saleDate;
    private List<Product> items;
    private String storeLocation;
    private Boolean couponUsed;
    private String purchaseMethod;
    private Customer customer;

    @Override
    public String toString() {
        return "\n***************************************" +
                "\nSale{" +
                "\nsaleDate=" + saleDate +
                ", \nitems=" + items +
                ", \nlocation='" + storeLocation + '\'' +
                ", \ncouponUsed=" + couponUsed +
                ", \ncustomer=" + customer +
                '}'+
                "\n********************************************";
    }
}
