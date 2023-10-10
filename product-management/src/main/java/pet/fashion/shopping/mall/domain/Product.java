package pet.fashion.shopping.mall.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import pet.fashion.shopping.mall.ProductManagementApplication;
import pet.fashion.shopping.mall.domain.ProductCreated;
import pet.fashion.shopping.mall.domain.ProductDeleted;

@Entity
@Table(name = "Product_table")
@Data
//<<< DDD / Aggregate Root
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToOne
    private Photo photo;

    private Integer size;

    @Embedded
    private Money price;

    @PostPersist
    public void onPostPersist() {
        ProductCreated productCreated = new ProductCreated(this);
        productCreated.publishAfterCommit();

        ProductDeleted productDeleted = new ProductDeleted(this);
        productDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    @PreRemove
    public void onPreRemove() {}

    public static ProductRepository repository() {
        ProductRepository productRepository = ProductManagementApplication.applicationContext.getBean(
            ProductRepository.class
        );
        return productRepository;
    }

    //<<< Clean Arch / Port Method
    public void updateProduct(UpdateProductCommand updateProductCommand) {
        //implement business logic here:

        ProductUpdated productUpdated = new ProductUpdated(this);
        productUpdated.publishAfterCommit();
    }
    //>>> Clean Arch / Port Method

}
//>>> DDD / Aggregate Root
