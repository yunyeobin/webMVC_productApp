package com.ssg.productapp.service;


import com.ssg.productapp.dto.ProductAppDTO;

import java.util.List;

public interface ProductAppService {
    void register(ProductAppDTO productAppDTO);
    List<ProductAppDTO> productList(String searchKeyword);
    ProductAppDTO getOne(Long pno);
    void modify(ProductAppDTO productAppDTO);
    void remove(Long pno);

}
