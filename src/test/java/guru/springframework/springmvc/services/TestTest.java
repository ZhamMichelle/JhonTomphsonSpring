package guru.springframework.springmvc.services;

import guru.springframework.springmvc.domain.Product;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestTest {
    private Product[] baratheons;
    private Product[] starks;


    @Before
    public void setUp() throws Exception {
        baratheons = new Product[3];
        baratheons[0] = new Product(1,1,"Robert", new BigDecimal("14.99"),"4");
        baratheons[1] = new Product(2,1,"Robert", new BigDecimal("14.99"),"4");
        baratheons[2] = new Product(3,1,"Robert", new BigDecimal("14.99"),"4");
        System.out.println("Baratheons initialised!");

        starks = new Product[3];
        starks[0] = new Product(1,1,"Stark", new BigDecimal("14.99"),"4");
        starks[1] = new Product(2,1,"Stark", new BigDecimal("14.99"),"4");
        starks[2] = new Product(3,1,"Stark", new BigDecimal("14.99"),"4");
        System.out.println("Starks initialised!");
    }


    @Test
    public void testGratefulLord() {
        int x = baratheons[0].getId(); //THIS IS LINE 36

        assertEquals(baratheons[1].getId(), (x+1));

    }
}
