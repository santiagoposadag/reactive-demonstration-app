package com.santiagoposada.restlibrarymongo.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
@Data
@NoArgsConstructor
public class Sales {

    @Id
    private String id;
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
                ", \npurchasedMethod='" + purchaseMethod + '\'' +
                ", \ncustomer=" + customer +
                '}'+
                "\n********************************************";
    }
}
