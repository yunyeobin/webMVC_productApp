package com.ssg.productapp.service;

import com.ssg.productapp.domain.ProductAppVO;
import com.ssg.productapp.dto.ProductAppDTO;
import com.ssg.productapp.mapper.ProductAppMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
@RequiredArgsConstructor
public class ProductAppServiceImpl implements ProductAppService {
    private ProductAppVO productAppVO;
    private final ModelMapper modelMapper;
    private final ProductAppMapper productAppMapper;

    @Override
    public void register(ProductAppDTO productAppDTO) {
        ProductAppVO productAppVO = modelMapper.map(productAppDTO, ProductAppVO.class);
        productAppMapper.insert(productAppVO);
    }

    @Override
    public List<ProductAppDTO> productList() {
        List<ProductAppVO> voList = productAppMapper.selectAll();
        List<ProductAppDTO> dtoList = voList.stream()
                .map(vo -> modelMapper.map(vo, ProductAppDTO.class))
                .sorted(Comparator.comparing(ProductAppDTO::getPno))//내림차순정렬
                .collect(Collectors.toList());
        return dtoList;
    }

    @Override
    public ProductAppDTO getOne(Long pno) {
        ProductAppDTO productAppDTO = modelMapper.map(productAppMapper.selectOne(pno), ProductAppDTO.class);
        return productAppDTO;
    }

    @Override
    public void modify(ProductAppDTO productAppDTO) {
        productAppVO = modelMapper.map(productAppDTO, ProductAppVO.class);
        productAppMapper.update(productAppVO);
    }

    @Override
    public void remove(Long pno) {

        productAppMapper.delete(pno);
    }

}
