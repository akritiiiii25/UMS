package com.ums.entity;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
@Entity
@Table(name="Product")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Product extends Base{


    @NotNull(message="productID")
    private Long productID;

    //    @NotEmpty(message="productNAME")
    private String productNAME;

    @NotEmpty(message="productDESCRIPTION")
    private String productDESCRIPTION;

    @NotNull(message="product price is required")
    private Double productPRICE;

    @ManyToOne
    @JoinColumn(name="order_id",nullable = true)
    private Order order;

    private Boolean isDelete = false;
}