package sinanaj.aldo.payment.service;

import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PisService.class)
public class BaseClass {

    @Autowired
    private PisService pisService;

    @Before
    public void setup() {
        RestAssuredMockMvc.standaloneSetup(pisService);
    }
}
