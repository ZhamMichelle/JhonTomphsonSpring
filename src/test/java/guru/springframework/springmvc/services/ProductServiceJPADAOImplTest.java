package guru.springframework.springmvc.services;

import guru.springframework.springmvc.domain.Product;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

//@ActiveProfiles("jpadao")
//@RunWith(MockitoJUnitRunner.class)
@RunWith(SpringJUnit4ClassRunner.class)
public class ProductServiceJPADAOImplTest {

//    @Mock
//    private ProductService productService;

    @InjectMocks
    private ProductServiceImpl productServiceJPADAO;

//    @Autowired
//    public void setProductService(ProductService productService) {
//        this.productService = productService;
//    }

    @Test
    public void testProductList() {

//        productService=productServiceJPADAO;

        System.out.println("size: " + productServiceJPADAO.listProducts().size());
        List<Product> products = productServiceJPADAO.listProducts();
        assert products.size()==5;
    }
}
