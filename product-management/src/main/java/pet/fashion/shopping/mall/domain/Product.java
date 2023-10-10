package pet.fashion.shopping.mall.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import pet.fashion.shopping.mall.ProductManagementApplication;

@Entity
@Table(name = "Product_table")
@Data
//<<< DDD / Aggregate Root
public class Product {

    @Id
    private String name;

    private Photo photo;

    private Money price;

    @PrePersist
    public void onPrePersist() {}

    public static ProductRepository repository() {
        ProductRepository productRepository = ProductManagementApplication.applicationContext.getBean(
            ProductRepository.class
        );
        return productRepository;
    }
}
//>>> DDD / Aggregate Root
