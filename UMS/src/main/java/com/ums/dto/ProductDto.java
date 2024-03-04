package com.ums.dto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDto {
    private Long productID;
    private String productNAME;
    private String productDESCRIPTION;
    private Double productPRICE;
    private Boolean isDeleted;

}