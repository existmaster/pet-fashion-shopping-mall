package pet.fashion.shopping.mall.common;

import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import pet.fashion.shopping.mall.MembershipManagementApplication;

@CucumberContextConfiguration
@SpringBootTest(classes = { MembershipManagementApplication.class })
public class CucumberSpingConfiguration {}
