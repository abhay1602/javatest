package com.example.orderservice.dto;

import javax.persistence.*;

@Entity
@Table(name = "ORDER_ITEMS")
public class OrderItems {

    @Id
    @GeneratedValue
    int id;
    @Column(name = "PRODUCT_CODE")
    String productCode;
    @Column(name = "PRODUCT_NAME")
    String productName;
    @Column(name = "QUANTITY")
    int quantity;

    public String getProductCode() {
        return productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

}
