package com.ssg.productapp.dto;

import lombok.*;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductAppDTO {
    private Long pno;
    private String pname;
    private int price;
    private int stock;
}
