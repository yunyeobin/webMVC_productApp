package com.ssg.productapp.controller;

import com.ssg.productapp.domain.ProductAppVO;
import com.ssg.productapp.dto.ProductAppDTO;
import com.ssg.productapp.service.ProductAppService;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/product")
@RequiredArgsConstructor
@Log4j2
public class ProductAppController {
    private final ProductAppService productAppService;

    @RequestMapping("/list")
    public String list(@RequestParam(value = "searchKeyword", required = false, defaultValue = "") String searchKeyword, Model model) {
        log.info("product list doing...");
        List<ProductAppDTO> dtoList = productAppService.productList(searchKeyword);
        model.addAttribute("dtoList", dtoList);
        //addAttribute메소드가 파라미터를 "dtoList"라는 이름으로 view로 같이 보내줌
        return "/product/list";
    }

    @GetMapping({"/read", "/modify"})
    public void read(long pno, Model model) {
        ProductAppDTO productAppDTO = productAppService.getOne(pno);
        model.addAttribute("dto", productAppDTO);
        //하나의 DTO객체를 dto라는 이름으로 view로~
    }

    @GetMapping("/register")
    public void register() {
        log.info("product register doing...");
        //알맞은 jsp에 요청 매핑만 해줌
    }

    @PostMapping("/register")
    public String registerPost(ProductAppDTO productAppDTO) {
        log.info("register post...");
        log.info(productAppDTO);
        productAppService.register(productAppDTO);
        return "redirect:/product/list";
        //메소드 실행 후(상품 추가등록 후) 다시 리스트 화면으로 가기 위한 반환값.
    }

    @PostMapping("/remove")
    public String remove(long pno) {
        log.info(pno);
        productAppService.remove(pno);
        return "redirect:/product/list";
    }

    @PostMapping("/modify")
    public String modify(ProductAppDTO productAppDTO) {
        log.info(productAppDTO);
        productAppService.modify(productAppDTO);
        return "redirect:/product/list";
    }
}
