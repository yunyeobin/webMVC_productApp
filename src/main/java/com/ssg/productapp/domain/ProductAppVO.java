package com.ssg.productapp.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductAppVO {
    private Long pno;
    private String pname;
    private int price;
    private int stock;

}
