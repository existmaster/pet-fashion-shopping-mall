package pet.fashion.shopping.mall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import pet.fashion.shopping.mall.domain.*;
import pet.fashion.shopping.mall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ProductCreated extends AbstractEvent {

    private Long id;
    private String name;
    private Photo photo;
    private Integer size;
    private Money price;

    public ProductCreated(Product aggregate) {
        super(aggregate);
    }

    public ProductCreated() {
        super();
    }
}
//>>> DDD / Domain Event
