import com.ssg.productapp.domain.ProductAppVO;
import com.ssg.productapp.dto.ProductAppDTO;
import com.ssg.productapp.mapper.ProductAppMapper;
import com.ssg.productapp.service.ProductAppService;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations="file:src/main/webapp/WEB-INF/root-context.xml")
public class serviceTest {
    @Autowired(required = false)
    private ProductAppService productAppService;
    @Autowired(required = false)
    private ProductAppMapper productAppMapper;

    @Test
    public void testList(){
        List<ProductAppDTO> list = productAppService.productList();
        for (ProductAppDTO productAppDTO : list){
            System.out.println(productAppDTO.getPname());
            System.out.println(productAppDTO.getPno());
            System.out.println(productAppDTO.getPrice());
            System.out.println(productAppDTO.getStock());
        }
    }

    @Test
    public void testMapperList(){
        List<ProductAppVO> list = productAppMapper.selectAll();
        for(ProductAppVO productAppVO : list){
            System.out.println(productAppVO.getPname());
            System.out.println(productAppVO.getPno());
            System.out.println(productAppVO.getStock());
            System.out.println(productAppVO.getPrice());
        }
    }
}
