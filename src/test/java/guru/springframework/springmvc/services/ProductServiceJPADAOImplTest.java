//package guru.springframework.springmvc.services;
//
//import guru.springframework.springmvc.domain.Product;
//import org.junit.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ActiveProfiles;
//
//import java.util.List;
//
////@RunWith(SpringJUnit4ClassRunner.class)
////@SpringApplicationConfiguration(JPAIntegrationConfig.class)
//@SpringBootTest
//@ActiveProfiles("jpadao")
//public class ProductServiceJPADAOImplTest {
//    private ProductService productService;
//
//    @Autowired
//    public void setProductService(ProductService productService) {
//        this.productService = productService;
//    }
//
//    @Test
//    public void productListTest() throws Exception{
//        List<Product> products=(List<Product>) productService.listProducts();
//
//        assert products.size()==5;
//    }
//}
