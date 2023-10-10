package pet.fashion.shopping.mall.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import pet.fashion.shopping.mall.domain.*;
import pet.fashion.shopping.mall.infra.AbstractEvent;

//<<< DDD / Domain Event
@Data
@ToString
public class ProductUpdated extends AbstractEvent {

    private String id;
    private String name;
    private File photo;
    private Money price;
    private Size size;

    public ProductUpdated(Product aggregate) {
        super(aggregate);
    }

    public ProductUpdated() {
        super();
    }
}
//>>> DDD / Domain Event
