//package guru.springframework.springmvc.controllers;
//
//import guru.springframework.springmvc.domain.Product;
//import guru.springframework.springmvc.services.ProductService;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.web.servlet.setup.MockMvcBuilders;
//
//import static org.hamcrest.Matchers.hasSize;
//import static org.hamcrest.Matchers.instanceOf;
//import static org.mockito.Mockito.when;
//import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
//import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class ProductControllerTest {
//
//    @Mock //Mockito Mock object
//    private ProductService productService;
//
//    @InjectMocks  //setups up controller, and injects mock objects into it.
//    private ProductController productController;
//
//    private MockMvc mockMvc;
//
//    @Before
//    public void setup(){
//        MockitoAnnotations.initMocks(this); //initilizes controller and mocks
//
//        mockMvc = MockMvcBuilders.standaloneSetup(productController).build();
//    }
//
//    @Test
//    public void testList() throws Exception{
//
//        List<Product> products = new ArrayList<>();
//        products.add(new Product());
//        products.add(new Product());
//
//        //specific Mockito interaction, tell stub to return list of products
//        when(productService.listProducts()).thenReturn((List) products); //need to strip generics to keep Mockito happy.
//
//        mockMvc.perform(get("/product/list"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("product/list"))
//                .andExpect(model().attribute("products", hasSize(2)));
//
//    }
//
//    @Test
//    public void testShow() throws Exception{
//        Integer id = 1;
//
//        //Tell Mockito stub to return new product for ID 1
//        when(productService.getProductById(id)).thenReturn(new Product());
//
//        mockMvc.perform(get("/product/show/1"))
//                .andExpect(status().isOk())
//                .andExpect(view().name("product/show"))
//                .andExpect(model().attribute("product", instanceOf(Product.class)));
//    }
//}
