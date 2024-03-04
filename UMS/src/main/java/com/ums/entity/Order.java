package com.ums.entity;
import jakarta.validation.constraints.Size;
import lombok.*;
import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Orders")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Order extends Base{

    @Column(name="orderName",nullable = false)
    @Size(min=2,max=50,message="Order name length must be between 2 and 50 characters.")
    private String orderName;

    @Column(name="orderDescription")
    private String orderDescription;

    @Column(name="orderDate",nullable = false)
    @Temporal(TemporalType.DATE)
    private Date orderDate;

    @OneToMany(mappedBy="order",cascade=CascadeType.ALL,orphanRemoval=true)
    private List<Product> products;


    public Order(Date orderDate) {
        this.orderDate = orderDate;
    }
}
