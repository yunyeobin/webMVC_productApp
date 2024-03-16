package com.ssg.productapp.mapper;

import com.ssg.productapp.domain.ProductAppVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ProductAppMapper {
    void insert(ProductAppVO productAppVO); //상품을 추가하는 메소드
    List<ProductAppVO> selectAll(String searchKeyword); //상품의 전체목록을 보여주는 메소드
    ProductAppVO selectOne(long pno); // pno에 해당하는 하나의 상품을 선택하는 메소드
    void delete(long pno); //pno에 해당하는 하나의 상품을 제거하는 메소드
    void update(ProductAppVO productAppVO); // 상품을 수정하는 메소드
}
