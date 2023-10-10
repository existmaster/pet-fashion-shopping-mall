package pet.fashion.shopping.mall.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import pet.fashion.shopping.mall.ProductManagementApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { ProductManagementApplication.class })
public class CucumberSpingConfiguration {}
