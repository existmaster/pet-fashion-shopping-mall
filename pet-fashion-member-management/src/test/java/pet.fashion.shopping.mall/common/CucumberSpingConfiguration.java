package pet.fashion.shopping.mall.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import pet.fashion.shopping.mall.PetFashionMemberManagementApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { PetFashionMemberManagementApplication.class })
public class CucumberSpingConfiguration {}
